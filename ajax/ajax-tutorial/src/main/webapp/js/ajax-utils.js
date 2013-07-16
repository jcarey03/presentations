/*
 * Creates and returns a new XHR request object.
 */
function getRequestObject() {
	if (window.XMLHttpRequest) { // FF, Safari, IE7/8, Chrome
		return new XMLHttpRequest();
	} else if (window.ActiveXObject) { // IE 5.5/6
		return new ActiveXObject("Microsoft.XMLHTTP");
	} else {
		return null; // fails on older and nonstandard browsers
	}
}

/*
 * Sends an Ajax request to the given server resource.  The response will be
 * displayed in an alert box.
 * 
 * @param url 	  		a server resource
 */
function alertMessage(url) {

	// create local request object
	var request = getRequestObject();

	// assigns the callback for request state changes
	request.onreadystatechange = function() {
		alertMsgResponseHandler(request)
	};

	// open the connection
	request.open("GET", // request type
			     url,   // server resource
			     "true" // we want asynchronous request
	);

	// sends the request asynchronously
	request.send(null); // POST data, null for GET
}

/*
 * Response handler that will simply display the response as text in an 
 * alert box.
 * 
 * @param request 		the XMLHttpRequest object
 */
function alertMsgResponseHandler(request) {
	// response is complete and successful
	if(request.readyState == 4 && request.status == 200) {  
		alert(request.responseText);
	}
}

/*
 * Sends an Ajax request to the given server resource.  The response will be
 * displayed in the HTML element with the given id.
 * 
 * @param url 	  		a server resource
 * @param elementId		the id of the HTML element to insert the response
 */
function insertMessage(url, elementId) {

	// create local request object
	var request = getRequestObject();

	// assigns the callback for request state changes
	request.onreadystatechange = function() {
		insertMsgResponseHandler(request, elementId)
	};

	// open the connection
	request.open("GET", // request type
			     url,   // server resource
			     "true" // we want asynchronous request
	);

	// sends the request asynchronously
	request.send(null); // POST data, null for GET
}

/*
 * Response handler that will display the response in the HTML element with the 
 * given id
 * 
 * @param request 		the XMLHttpRequest object
 * @param elementId		the id of the HTML element to insert the response
 */
function insertMsgResponseHandler(request, elementId) {
	// response is complete and successful
	if(request.readyState == 4 && request.status == 200) {  
		htmlInsert(elementId, request.responseText);
	}
}

/*
 * Insert the HTML data into the element that has the specified id.
 * 
 * @param id 		an element id
 * @param htmlData	the content to insert
 */
function htmlInsert(id, htmlData) {
	document.getElementById(id).innerHTML = htmlData;
}

/*
 * Trick so that the Firebug console.log function will be ignored 
 * (instead of crashing) in Internet Explorer.  Also see Firebug Lite and 
 * Faux Console if you want logging to actually do something on IE.
 * Firebug Lite: http://www.getfirebug.com/lite.html
 * Faux Console: http://icant.co.uk/sandbox/fauxconsole/
 */
try {
	console.log("Loading script");
} catch (e) {
	console = {
		log : function() {
		}
	};
}
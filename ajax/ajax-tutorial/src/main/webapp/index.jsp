<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" href="css/styles.css" type="text/css"/>    
        <script type="text/javascript" src="js/ajax-utils.js"></script>
        <title>Ajax Tutorial</title>
    </head>
    <body>
        <form action="#">
            <fieldset>
                <legend>
                    <input type="button" 
                           value="Alert Message" 
                           onclick="alertMessage('HelloAjaxMessage.html')"
                    />
                </legend>
            </fieldset>
            <fieldset>
                <legend>
		            <input type="button" 
		                   value="Insert Message" 
		                   onclick="insertMessage('getMessage', 'messageId')"
		            />
                </legend>
                <div>
                    <p id="messageId">Message will be inserted here!</p>
                </div>
            </fieldset>
        </form>
    </body>
</html>
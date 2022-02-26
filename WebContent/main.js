console.log("main called....")

function callServlet() {

	var xhr = new XMLHttpRequest()
	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {

			var data = xhr.responseText;
			alert(data)
		}
	}
	xhr.open('GET', '${http://localhost:8080/Adv_ROHITH/js}', true)
	xhr.send(null)
}
/**
 * 
 */
var XHR = new XMLHttpRequest();
function deptHeadApprove(i) {
	XHR.open("get", "/trms/deptHeadApprove?rid=" + i);
	XHR.onreadystatechange = processApprove(i);
	XHR.send();
}
function processApprove(i) {
	if(XHR.readyState == 4 && XHR.status == 200){
		var button = document.getElementById("approveButton" + i);
		button.setAttribute("disabled", "true");
	}
}
function deptHeadDeny(i){
	XHR.open("get", "/trms/deptHeadDeny?rid=" + i);
	XHR.onreadystatechange = processDeny(i);
	XHR.send();
}
function processDeny(i){
	if(XHR.readyState == 4 && XHR.status == 200){
		var button = document.getElementById("denyButton" + i);
		button.setAttribute("disabled", "true");
	}
}
function deleteReimb(i){
	XHR.open("get", "/trms/DeleteReimb?rid=" + i);
	XHR.onreadystatechange = processDelete;
	XHR.send();
}
function processDelete() {
	if(XHR.readyState == 4 && XHR.status == 200) {
		location.reload();
	}
}
function benCoApprove(i) {
	XHR.open("get", "/trms/benCoApprove?rid=" + i);
	XHR.onreadystatechange = processApprove(i);
	XHR.send();
}

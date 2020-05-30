/**
 * Created by KIP on 11.12.2017.
 */
// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("thirdceh");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal
function showModalPopup() {
    modal.style.display = "block";
};
btn.onclick = showModalPopup();

// When the user clicks on <span> (x), close the modal
function hideModalPopup() {
    modal.style.display = "none";
};
span.onclick = hideModalPopup();

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};

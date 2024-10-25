function loadPage(url, loc) {
    const timestamp = new Date().getTime(); // Generate a unique query string
    fetch(url+'?v=' + timestamp)
        .then(response => response.text())
        .then(data => {
            document.getElementById(loc).innerHTML = data;
        });
}

document.addEventListener("DOMContentLoaded", function() {
    // Code to execute when the DOM is fully loaded
    const timestamp = new Date().getTime(); // Generate a unique query string;
    const url='javabasiclessons/lessons/tree.html';
    const loc='tree';
    fetch(url+'?v=' + timestamp)
        .then(response => response.text())
        .then(data => {
            document.getElementById(loc).innerHTML = data;
        });
});
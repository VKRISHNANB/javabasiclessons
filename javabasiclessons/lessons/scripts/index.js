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
    const tree_url='javabasiclessons/lessons/tree.html';
    const tree_loc='tree';
    const home_url='javabasiclessons/lessons/home.html';
    const home_loc='content';
    fetch(tree_url+'?v=' + timestamp)
        .then(response => response.text())
        .then(data => {
            document.getElementById(tree_loc).innerHTML = data;
        });
    fetch(home_url+'?v=' + timestamp)
        .then(response => response.text())
        .then(data => {
            document.getElementById(home_loc).innerHTML = data;
        });
});
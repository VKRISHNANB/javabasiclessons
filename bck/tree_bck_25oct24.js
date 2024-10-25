// Toggle tree items
document.querySelectorAll('.tree-item > span').forEach(item => {
    item.addEventListener('click', () => {
        item.parentElement.classList.toggle('active');
    });
});

 // Handle page loading
 async function loadPage(url) {
    const contentDiv = document.getElementById('content');
    const loadingDiv = document.getElementById('loading');
    const errorDiv = document.getElementById('error');

    // Show loading state
    loadingDiv.classList.add('active');
    errorDiv.classList.remove('active');
    contentDiv.style.display = 'none';

    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }
        const content = await response.text();
        
        // Update content
        contentDiv.innerHTML = content;
        contentDiv.style.display = 'block';
    } catch (error) {
        console.error('Error loading page:', error);
        errorDiv.classList.add('active');
    } finally {
        loadingDiv.classList.remove('active');
    }
}
 // Add click event listeners to all page links
 document.querySelectorAll('.page-link').forEach(link => {
    link.addEventListener('click', (e) => {
        e.preventDefault();
        const url = link.href;
        loadPage(url);

        // Update URL without page reload
        history.pushState({}, '', url);
    });
});

// Handle browser back/forward buttons
window.addEventListener('popstate', () => {
    loadPage(window.location.href);
});

// Handle page loading
// const pages = {
//     installation: {
//         title: 'Installation',
//         content: 'Here are the installation instructions...'
//     },
//     quickstart: {
//         title: 'Quick Start Guide',
//         content: 'Follow these steps to get started...'
//     },
//     basic: {
//         title: 'Basic Tutorial',
//         content: 'Learn the basics...'
//     },
//     advanced: {
//         title: 'Advanced Tutorial',
//         content: 'Advanced concepts and techniques...'
//     }
// };

// document.querySelectorAll('.page-link').forEach(link => {
//     link.addEventListener('click', (e) => {
//         e.preventDefault();
//         const pageId = link.dataset.page;
//         const page = pages[pageId];
//         if (page) {
//             document.getElementById('content').innerHTML = `
//                 <h1>${page.title}</h1>
//                 <p>${page.content}</p>
//             `;
//         }
//     });
// });
// Expand first tree item by default
document.querySelector('.tree-item').classList.add('active');

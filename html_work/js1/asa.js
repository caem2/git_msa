function showSection(sectionId) {
  var sections = document.querySelectorAll('.section');
  sections.forEach(function(section) {
      section.classList.remove('active');
  });

  var activeSection = document.getElementById(sectionId);
  if (activeSection) {
      activeSection.classList.add('active');
  }
}

document.querySelector('.nav-toggle').addEventListener('click', function() {
  var navMenu = document.querySelector('.nav-menu');
  navMenu.classList.toggle('active');
});

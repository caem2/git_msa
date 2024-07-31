const bars = document.querySelector(".fas");
const menu = document.querySelector(".menu");
const icon = document.querySelector(".icon");

bars.addEventListener("click", () => {
  menu.classList.toggle("active");
  icon.classList.toggle("active");
});

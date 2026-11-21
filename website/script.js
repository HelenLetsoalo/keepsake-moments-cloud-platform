console.log("Keepsake Moments website is ready!");

const detailsButton = document.querySelector(".details-button");
const productDetails = document.querySelector(".product-details");

detailsButton.addEventListener("click", function() {
    productDetails.style.display = "block";
});

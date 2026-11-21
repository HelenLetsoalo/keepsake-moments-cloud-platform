console.log("Keepsake Moments website is ready!");

const detailsButton = document.querySelector(".details-button");
const productDetails = document.querySelector(".product-details");

detailsButton.addEventListener("click", function() {

    if (productDetails.style.display === "none") {
        productDetails.style.display = "block";
        detailsButton.textContent = "Show Less";
    } else {
        productDetails.style.display = "none";
        detailsButton.textContent = "Show More Details";
    }

});

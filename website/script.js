console.log("Keepsake Moments website is ready!");

const productCards = document.querySelectorAll(".product-card");

productCards.forEach(function(card) {
    const detailsButton = card.querySelector(".details-button");
    const productDetails = card.querySelector(".product-details");

    detailsButton.addEventListener("click", function() {

    if (window.getComputedStyle(productDetails).display === "none") {
        productDetails.style.display = "block";
        detailsButton.textContent = "Show Less";
    } else {
        productDetails.style.display = "none";
        detailsButton.textContent = "Show More Details";
    }
        
    });

});

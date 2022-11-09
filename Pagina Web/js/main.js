$(document).ready(function() {

    function showPopup() {
        $('.pop-up').addClass('show');
    }

    $("#close").click(function() {
        $('.pop-up').removeClass('show');
    });

    $(".registro").click(showPopup);

    setTimeout(showPopup, 5000);



});



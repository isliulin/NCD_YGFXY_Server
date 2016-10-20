$(function(){
	$(window).on('scroll', function(){
		if($(window).scrollTop() > 100){
			$('.logoheader').removeClass('large').addClass('small');
		} else {
			$('.logoheader').removeClass('small').addClass('large');
		}
	});
});
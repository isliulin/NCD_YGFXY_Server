$(function () {
    var $menu = $(".menu"), $menuLi = $menu.find("li"), $current = $menu.find('.current');

    $menuLi.hover(function () {
        var $this = $(this), num = $menuLi.index($this), current = $menuLi.index($(".first")), len = current - num;

        $menu.css("background-position", (171 * current) + "px" + " bottom");
        $current.removeClass("lihover");
        $menuLi.removeClass("first");
        $this.addClass("first");
        if (len <= 0) { len = -len; };

        $menu.stop().animate({ backgroundPosition: (171 * num + 30) + "px" + " bottom" }, 170 * len);

    });

    $menuLi.hover(
      function () {
        var $this = $(this);
        var childmenu = $this.find("dl");
          childmenu.stop(true, true).fadeIn(0);
      }, function () {
        var $this = $(this);
        var childmenu = $this.find("dl");
          childmenu.fadeOut(500, function () {
              childmenu.css("display", "none");
          });
      }
    );

    $menu.mouseleave(function () {
        var $this = $(this), num = $menuLi.index($this), current = $menuLi.index($current), len = current - num;
        $menuLi.removeClass("first");
        $current.addClass("first");
        if (len <= 0) { len = -len; };
        $menu.stop().animate({ backgroundPosition: (170 * current + 1) + "px" + " bottom" }, 170 * len);
    });
    $("a.noclick").click(function (event) {
        event.preventDefault();
    });
});

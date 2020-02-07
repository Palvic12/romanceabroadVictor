package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

//    ________________________________
//    HOME Page
//    ________________________________
    public static final By LINK_HOME = By.cssSelector("a.nav-link[href='#']");
    public static final By MAIN_PAGE_NAV_BAR_TABS = By.xpath("//ul[@class='navbar-nav']//li");
    public static final By HEART_ROMANCE_ABROAD = By.cssSelector("a>img[src='/img/logo.jpg']");
    public static final By DISCOUNT_ALERT = By.cssSelector("div.discountalert>a");

    public static final By LINK_YOU_TUBE_VIDEO = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By LINK_YOU_TUBE_TITLE = By.cssSelector(".ytp-title-link.yt-uix-sessionlink");
    public static final By BUTTON_YOU_TUBE_PLAY = By.cssSelector("button.ytp-large-play-button.ytp-button");
    public static final By YOU_TUBE_VIDEO_SURFACE = By.cssSelector(".video-stream.html5-main-video");
    public static final By BUTTON_REQUEST_TOUR_INFO = By.cssSelector(".btn.btn-primary.btn-xl.js-scroll-trigger[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    public static final By PAGE_TITLE = By.xpath("//title");
    public static final By JOIN_TODAY_LINK = By.xpath("//a[contains(text(),'JOIN TODAY!')]");
    public static final By H1_TITLE = By.xpath("//h1");


//    ________________________________
//    HOW WE WORK Page
//    ________________________________

    public static final By LINK_HOW_WE_WORK = By.xpath("//a[contains(text(),'HOW WE WORK')]");
    public static final By OPEN_MENU_BTN = By.xpath("//i[@class='fa fa-bars fa-lg item']");
    public static final By CLOSE_MENU_BTN = By.xpath("//span[@id='slidemenu-close']");
    public static final By LEFT_MENU_GROUP = By.xpath("//div[@class='main-menu']//li[@class='menu-group ']");
    public static final By MAIN_MENU_TABS = By.xpath("//header[@id='main-menu-container']//a");
    public static final By WEB_ELEMENT_FOOTER_MENU_TABS = By.cssSelector("ul.footer-menu-list-block.list-group>li>a");
    public static final By WEB_ELEMENT_INNER_MENU_LINKS = By.cssSelector("li>div.info-menu-inner>a");
    public static final By MENU_GROUP_LINK_HOME = By.cssSelector(".menu-group>a[href='http://marryukrainianlady.com']");
    public static final By MENU_GROUP_LINK_SIGN_UP = By.cssSelector(".menu-group>a[href='https://romanceabroad.com/users/registration/']");
    public static final By MENU_GROUP_LINK_LOGIN = By.cssSelector(".menu-group>a[href='https://romanceabroad.com/users/login_form/']");
    public static final By MENU_GROUP_LINK_NEWS = By.cssSelector(".menu-group>a[href='https://romanceabroad.com/news/']");
    public static final By MENU_GROUP_LINK_POLLS = By.cssSelector(".menu-group>a[href='https://romanceabroad.com/polls/']");       //different link!!!!!!
                        // MENU_GROUP_LINK_SIGN_UP
    public static final By USER_REGISTRATION_EMAIL_TEXT_FIELD = By.xpath("//input[@type='text'][@name='email']");
    public static final By USER_REGISTRATION_USERNAME_TEXT_FIELD = By.xpath("//input[@type='text'][@name='nickname']");
    public static final By USER_REGISTRATION_PASSWORD_TEXT_FIELD = By.xpath("//input[@type='text'][@name='password']");
    public static final By USER_REGISTRATION_DROP_DOWN_DAY = By.cssSelector("div#daySelect");
    public static final By USER_REGISTRATION_DROP_DOWN_MONTH = By.cssSelector("div#monthSelect");
    public static final By USER_REGISTRATION_DROP_DOWN_YEAR = By.cssSelector("div#yearSelect");
    public static final By USER_REGISTRATION_DAY_LIST = By.xpath("//div[@id='daySelect']//li//a");
    public static final By USER_REGISTRATION_MONTH_LIST = By.xpath("//div[@id='monthSelect']//li//a");
    public static final By USER_REGISTRATION_YEAR_LIST = By.xpath("//div[@id='yearSelect']//li//a");
    public static final By USER_REGISTRATION_PHONE_TEXT_FIELD = By.xpath("//input[@type='text'][@name='phone']");
    public static final By USER_REGISTRATION_LOCATION_TEXT_FIELD = By.xpath("//input[@type='text'][@name='region_name']");
    public static final By USER_REGISTRATION_LOCATION_LIST = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By USER_REGISTRATION_CHECK_BOX_LATEST_NEWS = By.cssSelector("input#sub1");
    public static final By USER_REGISTRATION_CHECK_BOX_CONFIRMATION = By.cssSelector("input#confirmation");
    public static final By USER_REGISTRATION_REGISTER_BUTTON = By.cssSelector("input.btn.btn-primary");
                        // MENU_GROUP_LINK_LOGIN

    public static final By HEADER_MENU_LINKS = By.xpath("//a[@data-item='txt']");
    public static final By HEADER_LINK_HEART = By.xpath("//div[@class='logo-mobile-version top-menu-item']");
    public static final By HEADER_BUTTON_FIND_PEOPLE = By.cssSelector("#main_search_button_user_line");
    public static final By HEADER_BUTTON_LOGIN = By.cssSelector("#ajax_login_link");

    public static final By ROW_MARRY_UKRAINIAN_LADY_LINK = By.cssSelector("span>a[href='https://romanceabroad.com/']");
    public static final By ROW_PAGE_CONTENT_LINK = By.cssSelector("span>a[href='https://romanceabroad.com/content/']");

    public static final By VERT_LINK_ADVERTISING = By.cssSelector("a[href='https://romanceabroad.com/content/view/advertising']");
    public static final By VERT_LINK_LEGAL_TERMS = By.cssSelector(".info-menu-inner>a[href='https://romanceabroad.com/content/view/legal-terms']");
    public static final By VERT_LINK_PRIVACY = By.cssSelector(".info-menu-inner>a[href='https://romanceabroad.com/content/view/privacy-and-security']");
    public static final By VERT_LINK_HOW_WORKS = By.cssSelector(".info-menu-inner>a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By VERT_LINK_SHIPPING_TERMS = By.cssSelector(".info-menu-inner>a[href='https://romanceabroad.com/content/view/shipping_terms']");
    public static final By VERT_LINK_TRAVEL = By.cssSelector(".info-menu-inner>a[href='https://romanceabroad.com/content/view/travel-to-ukraine']");
    public static final By VERT_LINK_BLOG = By.xpath("//div[contains(text(),'Blog')]");
    public static final By VERT_LINK_KHARKOV = By.cssSelector("a[href='https://romanceabroad.com/content/view/kharkov-dating-agency']");
    public static final By VERT_LINK_KIEV = By.cssSelector("a[href='https://romanceabroad.com/content/view/kiev-dating-agency']");
    public static final By VERT_LINK_ODESSA = By.cssSelector("a[href='https://romanceabroad.com/content/view/odessa-dating-agency']");
    public static final By VERT_LINK_MAIL_ORDER = By.cssSelector("a[href='https://romanceabroad.com/content/view/mail-order-girls']");
    public static final By VERT_LINK_UKRAINIAN_GIRLS = By.cssSelector("a[href='https://romanceabroad.com/content/view/beautiful-urkainian-girls']");
    public static final By VERT_LINK_UKRAINIAN_BRIDES = By.cssSelector("a[href='https://romanceabroad.com/content/view/real-ukrainian-brides']");
    public static final By VERT_LINK_EST_EUROPE_WOMEN = By.cssSelector("a[href='https://romanceabroad.com/content/view/eastern-european-women']");
    public static final By VERT_LINK_MARRIAGE_AGENCY_UKRAINE = By.cssSelector("a[href='https://romanceabroad.com/content/view/marriage-agency-in-ukraine']");
    public static final By VERT_LINK_KIEV_DATING_SITE = By.cssSelector("a[href='https://romanceabroad.com/content/view/kiev-dating-site']");
    public static final By VERT_LINK_FIND_UKR_GIRLFRIEND = By.cssSelector("a[href='https://romanceabroad.com/content/view/find-ukrainian-girlfriend']");
    public static final By VERT_LINK_SLAVIC_WOMEN = By.cssSelector("a[href='https://romanceabroad.com/content/view/slavic-women-for-marriage']");
    public static final By VERT_LINK_HOW_MARRY_UKR = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-to-marry-ukrainian-lady']");
    public static final By VERT_LINK_FREE_UKR_DATING_SITE = By.cssSelector("a[href='https://romanceabroad.com/content/view/free-ukrainian-dating-site']");
    public static final By VERT_LINK_9_FACTORS = By.cssSelector("a[href='https://romanceabroad.com/content/view/9-factors-to-keep-in-mind-when-dating-a-ukrainian']");
    public static final By VERT_LINK_DIFFERENCE_DATING_COURTING = By.cssSelector("a[href='https://romanceabroad.com/content/view/is-there-a-difference-between-dating-or-courting']");

    public static final By LANGUAGE_ENGLISH = By.xpath("//a[contains(text(),'English')]");
    public static final By LANGUAGE_RUSSIAN = By.cssSelector("li.last");

    public static final By FOOTER_LINK_CONTACT = By.cssSelector("a[href='https://romanceabroad.com/tickets/']");
    public static final By FOOTER_LINK_SITEMAP = By.cssSelector("a[href='https://romanceabroad.com/site_map/']");
    public static final By FOOTER_LINK_HOW_WORKS = By.cssSelector(".footer-menu-list-group-item>a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By FOOTER_LINK_NEWS = By.cssSelector(".footer-menu-list-group-item>a[href='https://romanceabroad.com/news/']");
    public static final By FOOTER_LINK_PRIVACY = By.cssSelector(".footer-menu-list-group-item>a[href='https://romanceabroad.com/content/view/privacy-and-security']");
    public static final By FOOTER_LINK_TERMS_OF_USE = By.cssSelector(".footer-menu-list-group-item>a[href='https://romanceabroad.com/content/view/legal-terms']");

    //ContactUs
    public static final By CONTACT_US_REASON_SELECT = By.xpath("//select[@name='id_reason']");
    public static final By CONTACT_US_NAME_TEXT_BOX = By.xpath("//input[@name='user_name']");
    public static final By CONTACT_US_EMAIL_TEXT_BOX = By.xpath("//input[@name='user_email']");
    public static final By CONTACT_US_SUBJECT_TEXT_BOX = By.xpath("//input[@name='subject']");
    public static final By CONTACT_US_MESSAGE_TEXT_AREA = By.xpath("//textarea[@name='message']");
    public static final By CONTACT_US_SECURITY_CODE_TEXT_BOX = By.xpath("//input[@id='g-recaptcha-response']");
    public static final By CONTACT_US_SEND_BUTTON = By.xpath("//input[@name='btn_save']");

//    ________________________________
//    SearchPage (PrettyWomen)
//    ________________________________

    public static final By LINK_SEARCH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By SORTER_ARROW_UP = By.cssSelector("i.fa.fa-arrow-up.gray");
    public static final By SORTER_ARROW_DOWN = By.cssSelector("i.fa.fa-arrow-down.gray");
    public static final By LINK_LIST_VIEW = By.xpath("//a[contains(text(),'List view')]");
    public static final By LINK_GALLERY_VIEW = By.xpath("//a[contains(text(),'Gallery view')]");
    public static final By NEXT_PAGE_SORT_BLOCK = By.cssSelector("i.fa.fa-caret-right");
    public static final By PREVIOUS_PAGE_SORT_BLOCK = By.cssSelector("i.fa.fa-caret-left");
    public static final By GALLERY_PICTURE_SEARCH = By.xpath("//a[@class='g-pic-border g-rounded']");
    public static final By LAST_PAGE_PAGINATION = By.xpath("//a[contains(text(),'»')]");
    public static final By FIRST_PAGE_PAGINATION = By.xpath("//a[contains(text(),'«')]");
    public static final By NEXT_PAGE_PAGINATION = By.xpath("//a[contains(text(),'>')]");
    public static final By PREVIOUS_PAGE_PAGINATION = By.xpath("//a[contains(text(),'<')]");

    public static final By DROP_DOWN_LIST_AGE_MIN = By.cssSelector("select#age_min");
    public static final By DROP_DOWN_LIST_AGE_MAX = By.cssSelector("select#age_max");
    public static final By BUTTON_MAIN_SEARCH = By.cssSelector("input#main_search_button_user_advanced");
    public static final By TEXT_USER_INFO = By.xpath("//div[@class='text-overflow']");

//    ________________________________
//    Media Page (PHOTOS)
//    ________________________________

    public static final By LINK_MEDIA = By.cssSelector("a[href='https://romanceabroad.com/media/index']");
    public static final By MEDIA_LINKS = By.xpath("//a[@class='b-tabs__text']");
    public static final By DROP_DOWN_LIST_MEDIA_SORTER = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    public static final By DROP_DOWN_LIST_MEDIA_SORTER_ALBUMS = By.xpath("//div[@class='col-xs-12']//select[@id='album_id']");
    public static final By PHOTO_SORTER_ARROW_UP = By.cssSelector(".fa-arrow-up");
    public static final By PHOTO_SORTER_ARROW_DOWN = By.cssSelector(".fa-arrow-down");
    public static final By GALLERY_PICTURE_MEDIA = By.xpath("//a[@class='g-pic-border g-rounded g-users-gallery__photo-img']");
    public static final By TEXT_MEDIA = By.xpath("//div[@class='g-flatty-block']");
    public static final By MEDIA_ALBUM = By.xpath("//span[@data-click= 'album']");

    public static final By LINK_ALL = By.cssSelector("a[href='https://romanceabroad.com/media/all']");
    public static final By LINK_PHOTO = By.cssSelector("a[href='https://romanceabroad.com/media/photo']");
    public static final By LINK_VIDEO = By.cssSelector("a[href='https://romanceabroad.com/media/video']");
    public static final By LINK_ALBUMS = By.cssSelector("a[href='https://romanceabroad.com/media/albums']");
    public static final By DROP_DOWN_LIST_ALBUMS_SORTER = By.xpath("//select[@id='album_id']");


//    ________________________________
//    Gifts Page
//    ________________________________

    public static final By TEXT_FIELD_SEARCH_GIFT = By.xpath("//input[@type='text'][@name='search_product']");
    public static final By BUTTON_SEARCH_GIFT = By.xpath("//button[@id='search_friend'][@type='submit']");
    public static final By LINK_GIFT = By.cssSelector("a[href='https://romanceabroad.com/store/category-sweets']");
    public static final By BESTSELLERS_LINKS = By.xpath("//div[@class='info']//a");
    public static final By GALLERY_PICTURE_GIFTS = By.xpath("//a[@class='g-pic-border g-rounded g-users-gallery__photo-img']");


//    ________________________________
//    TourToUkraine Page
//    ________________________________

    public static final By LINK_TOUR = By.cssSelector("li.nav-item>a[href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']");
    public static final By GALLERY_PICTURE_TOUR = By.xpath("//div[@class='product-main-media pg-thumbnail']//img[@class='img-rounded img-responsive']");
    public static final By RELATED_ITEMS = By.xpath("//ul[@class='user-gallery']//img");

//    ________________________________
//    Blog Page
//    ________________________________

    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By BLOG_TITLE = By.xpath("//h1[contains(text(),'Blog')]");
//    public static final By BLOG_ALL_LINKS = By.cssSelector("div.info-content-block.wysiwyg>ul>li>a");
//    public static final By BLOG_ALL_LINKS = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//a");
    public static final By BLOG_ALL_LINKS = By.cssSelector("li>div.info-menu-inner>a");

//    ________________________________
//   Sign In Page
//    ________________________________
    public static final By LINK_SIGN_IN = By.cssSelector("li.nav-item>a[href='https://romanceabroad.com/users/login_form']");
    public static final By SIGNIN_TITLE = By.xpath("//h1[contains(text(),'Login')]");
    public static final By TEXT_FIELD_SIGNIN_EMAIL = By.cssSelector("input[name='email']");
    public static final By ERROR_MESSAGE_LOGIN_TEXT = By.xpath("//div[@class='error alert-danger alert-warning_pop_']");
    public static final By TEXT_FIELD_SIGNIN_PASSWORD = By.cssSelector("input[name='password']");
    public static final By LINK_FORGOT_PASSWORD = By.xpath("//a[contains(text(),'Forgot password?')]");
    public static final By BUTTON_SIGN_IN = By.cssSelector("button[name='logbtn']");

//    ________________________________
//   Registration Page
//    ________________________________

    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By HEADER_GET_STARTED = By.xpath("//body[@id='page-top']/div[@id='pjaxcontainer']/header[@class='masthead text-center text-white d-flex']/div[@class='container my-auto']/div[@class='row']/div[@class='col-lg-8 mx-auto']/div[@class='registration-block']/form/div[@class='main-block-pages']/div[@class='pages-wraper']/div[@id='second-registration-page']/div[1]/div[2]/div[1]");

    public static final By BUTTON_NEXT_FIRST_PART = By.xpath("//button[@data-action='next-page'][text()='Next']"); //(after Password)
    public static final By BUTTON_NEXT2 = By.cssSelector("button[data-action='update-profile']"); //(after check box)

    public static final By TOOLTIP_ERROR_MESSAGE = By.xpath("//div[@class='tooltip']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By TEXT_FIELD_USERNAME = By.cssSelector("input#nickname.form-control");
    public static final By DROP_DOWN_DAY = By.cssSelector("div#daySelect");
    public static final By DROP_DOWN_MONTH = By.cssSelector("div#monthSelect");
    public static final By DROP_DOWN_YEAR = By.cssSelector("div#yearSelect");
    public static final By DAY_LIST = By.xpath("//div[@id='daySelect']//li//a");
    public static final By MONTH_LIST = By.xpath("//div[@id='monthSelect']//li//a");
    public static final By YEAR_LIST = By.xpath("//div[@id='yearSelect']//li//a");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name='data[phone]']");
    public static final By TEXT_FIELD_LOCATION = By.cssSelector("input[name='region_name']");
    public static final By LOCATION_LIST = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By CHECK_BOX_CONFIRMATION = By.cssSelector("input#confirmation");
}

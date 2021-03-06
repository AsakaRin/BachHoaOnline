<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./../css/base.css">
<link rel="stylesheet" type="text/css" href="./../css/home.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<!-- notification and profile -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./../css/base.css">
<link rel="stylesheet" type="text/css" href="./../css/add_good.css">
<!-- <link rel="stylesheet" type="text/css" href="./../css/btn_specical.css"> -->

<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
    $(document).ready(function () {
        $(".profile .icon_wrap").click(function () {
            $(this).parent().toggleClass("active");
            $(".notifications").removeClass("active");
        });

        $(".notifications .icon_wrap").click(function () {
            $(this).parent().toggleClass("active");
            $(".profile").removeClass("active");
        });

        $(".show_all .link").click(function () {
            $(".notifications").removeClass("active");
            $(".popup").show();
        });

        $(".close").click(function () {
            $(".popup").hide();
        });
    });
</script>

<!--  end of notification and profile -->


<head>
	<meta charset="utf-8">
	<title>Shopping Funny</title>
</head>
<body>
	<div class="header_box">
		<div class="header_logo">
			<a href="./home.html"><img src="./../img/icon_logo.png"></a>
		</div>
		<div class="header_search_bar">
			<input type="text" name="header_search_bar_input" placeholder="T??m ki???m ...">
			<a href="./search.html"><i class="fas fa-search"></i></a>
		</div>
		<div class="header_auth">
			<!-- <div class="wrapper"> -->
				<div class="navbar" style="background-color: inherit;">

					<div class="navbar_right">
						<div class="cart">
							<a href="./cart.html">
								<i class="fas fa-shopping-cart"></i>
							</a>
						</div>
						<div class="notifications">
							<div class="icon_wrap"><i class="far fa-bell"></i></div>
		
							<div class="notification_dd">
								<ul class="notification_ul">
									<li class="starbucks success">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												????n ?????t coffee Starbucks.
											</div>
											<div class="sub_title">
												??ang giao h??ng, d??? ki???n c??n 10 ph??t
											</div>
										</div>
										<div class="notify_status">
											<p>S???p t???i</p>
										</div>
									</li>
									<li class="baskin_robbins failed">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												Gi???m gi?? 100% khi mua t???i shop Fboy Baskin ngay h??m nay
											</div>
											<div class="sub_title">
												?????c quy???n duy nh???t 1000% s???n ph???m l?? c?? th???t v?? 20 b???n may m???n nh???t s??? ???????c ??i th??m s??? th?? hoa c???i ?????
											</div>
										</div>
										<div class="notify_status">
											<p>????ng</p>
										</div>
									</li>
									<li class="mcd success">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												????n mua s??ch tr??n MCD ??ang ???????c ch??? duy???t
											</div>
											<div class="sub_title">
												MCD s??? nhanh ch??ng th??ng b??o cho b???n s???m nh???t.
											</div>
										</div>
										<div class="notify_status">
											<p>Ch??? duy???t</p>
										</div>
									</li>
									<li class="pizzahut failed">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												????n h??ng pizzahut ch??a ???????c thanh to??n
											</div>
											<div class="sub_title">
												B???n c???n thanh to??n online ????? ?????t h??ng kh??ng ti???p x??c
											</div>
										</div>
										<div class="notify_status">
											<p>Failed</p>
										</div>
									</li>
									<li class="kfc success">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												????n h??ng g?? chi??n m???m KFC c??n 2 ph??t t???i n??i
											</div>
											<div class="sub_title">
												B???n chu???n b??? nh???n h??ng nh??
											</div>
										</div>
										<div class="notify_status">
											<p>Success</p>
										</div>
									</li>
									<li class="show_all">
										<p class="link">Show All Activities</p>
									</li>
								</ul>
							</div>
		
						</div>
						<div class="profile">
							<div class="icon_wrap">
								<img src="./../img/profile_pic.png" alt="profile_pic">
								<span class="name">John Alex</span>
								<i class="fas fa-chevron-down"></i>
							</div>
		
							<div class="profile_dd">
								<ul class="profile_ul">
									<li><a href="./profile.html">T??i kho???n c???a t??i</a></li>
									<li><a href="./order_status.html">????n mua</a></li>
									<li><a href="./manage_supply.html">Qu???n l?? nh?? cung c???p</a></li>
									<li><a href="./manage_employee.html">Qu???n l?? nh??n vi??n</a></li>
									<li><a href="./manage_client.html">Qu???n l?? kh??ch h??ng</a></li>
									<li><a href="./confirm.html">Qu???n l?? ????n h??ng</a></li>				                    
				                    <li><a href="./manage_product.html">Qu???n l?? s???n ph???m</a></li>
				                    <li><a href="./supply.html">Nh???p s???n ph???m</a></li>			                    
				                    <li><a href="./statistic_goods.html">Th???ng k?? s???n ph???m theo doanh thu</a></li>
				                    <li><a href="./statistic_guest.html">Th???ng k?? kh??ch h??ng theo doanh thu</a></li>
				                    <li><a href="./statistic_supply.html">Th???ng k?? nh?? cung c???p theo l?????ng s???n ph???m nh???p</a></li>
				                    <li><a href="./manager_bill.html">Tra c???u th??ng tin h??a ????n</a></li>
				                    <li><a href="./login.html">????ng xu???t</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
		
				<div class="popup">
					<div class="shadow"></div>
					<div class="inner_popup">
						<div class="notification_dd">
							<ul class="notification_ul">
								<li class="title">
									<p>All Notifications</p>
									<p class="close"><i class="fas fa-times" aria-hidden="true"></i></p>
								</li>
								<li class="starbucks success">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Success</p>
									</div>
								</li>
								<li class="baskin_robbins failed">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Failed</p>
									</div>
								</li>
								<li class="mcd success">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Success</p>
									</div>
								</li>
								<li class="baskin_robbins failed">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Failed</p>
									</div>
								</li>
								<li class="pizzahut failed">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Failed</p>
									</div>
								</li>
								<li class="kfc success">
									<div class="notify_icon">
										<span class="icon"></span>
									</div>
									<div class="notify_data">
										<div class="title">
											Lorem, ipsum dolor.
										</div>
										<div class="sub_title">
											Lorem ipsum dolor sit amet consectetur.
										</div>
									</div>
									<div class="notify_status">
										<p>Success</p>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
		
			<!-- </div> -->
		</div>
	</div>

	<div class="home_box">

		<div class="menu_bar">		
			<div class="title">Danh m???c s???n ph???m</div>
			<div class="item">
				S???n ph???m ??n li???n
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						M?? ??n li???n
					</div>
					<div class="sub_item">
						Ph???, h??? ti???u, mi???n
					</div>
					<div class="sub_item">
						Ch??o g??i, ch??o t????i
					</div>
					<div class="sub_item">
						B??nh canh, b??nh ??a
					</div>
					<div class="sub_item">
						L????ng kh??
					</div>
				</div>
			</div>
			<div class="item">
				????? t????i s???ng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Th???t l???n
					</div>
					<div class="sub_item">
						G??, tr???ng
					</div>
					<div class="sub_item">
						Rau c??? s???ch
					</div>
					<div class="sub_item">
						C??, h???i s???n
					</div>
					<div class="sub_item">
						Th???t d??
					</div>
				</div>
			</div>
			<div class="item">
				????? u???ng c??c lo???i
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						N?????c ng???t
					</div>
					<div class="sub_item">
						N?????c kho??ng
					</div>
					<div class="sub_item">
						Cafe
					</div>
					<div class="sub_item">
						Tr?? s???a
					</div>
					<div class="sub_item">
						S???a t????i
					</div>
				</div>
			</div>
			<div class="item">
				Gia v??? n??m
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						N?????c m???m
					</div>
					<div class="sub_item">
						S??p
					</div>
					<div class="sub_item">
						Gi???u ??n
					</div>
					<div class="sub_item">
						B???t chi??n
					</div>
					<div class="sub_item">
						N?????c ch???m
					</div>
				</div>
			</div>
			<div class="item">
				Nh?? c???a ?????i s???ng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Ly, C???c, B??nh n?????c
					</div>
					<div class="sub_item">
						V??? sinh nh?? c???a
					</div>
					<div class="sub_item">
						S???a ch???a nh?? c???a
					</div>
					<div class="sub_item">
						Trang tr?? nh?? c???a
					</div>
				</div>
			</div>
			<div class="item">
				Ch??m s??c th?? c??ng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Th???c ??n th?? c??ng
					</div>
					<div class="sub_item">
						????? d??ng cho th?? c??ng
					</div>
					<div class="sub_item">
						Thu???c h??? tr???
					</div>
				</div>
			</div>
			<div class="item">
				????? ch??i
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						????? ch??i ??i???u khi???n
					</div>
					<div class="sub_item">
						?????t n???n
					</div>
					<div class="sub_item">
						G???u b??ng
					</div>
				</div>				
			</div>
			<div class="item">
				D???ng c??? th??? thao
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						G???y gold, gi???
					</div>
					<div class="sub_item">
						Gym
					</div>
					<div class="sub_item">
						B??ng th??? thao
					</div>
					<div class="sub_item">
						Gi??y th??? thao
					</div>
				</div>	
			</div>
			<div class="item">
				Linh ki???n ??i???n t???
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Linh ki???n m??y t??nh
					</div>
					<div class="sub_item">
						Linh ki???n ??i???n tho???i
					</div>
					<div class="sub_item">
						Camera
					</div>
				</div>	
			</div>
			<div class="item">
				D???ng c??? h???c sinh
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Gi???y ki???m tra
					</div>
					<div class="sub_item">
						B??t m???c, b??t bi, b??t ch??
					</div>
					<div class="sub_item">
						B??n h???c
					</div>
					<div class="sub_item">
						????n h???c
					</div>
				</div>	
			</div>
			<div class="item">
				????? d??ng c?? nh??n
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Kh??n m???t, kh??n t???m
					</div>
					<div class="sub_item">
						Keo vu???t t??c
					</div>
					<div class="sub_item">
						M???t n???
					</div>
					<div class="sub_item">
						Len
					</div>
				</div>
			</div>
			<div class="item">
				????? ??i???n gia d???ng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Qu???t
					</div>
					<div class="sub_item">
						????n quang, iot
					</div>
					<div class="sub_item">
						B???p ??i???n, b???p t???
					</div>
					<div class="sub_item">
						M??y t??nh
					</div>
					<div class="sub_item">
						Tivi
					</div>
				</div>
			</div>
			<div class="item">
				Qu?? l??u ni???m
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						L???t ?????t
					</div>
					<div class="sub_item">
						Gi??? qu??
					</div>
					<div class="sub_item">
						B??u thi???p
					</div>
				</div>
			</div>
		</div>
		
		<marquee behavior="scroll" direction="left" class="home_notfication" scrollamount="15">
			<span>&diams; ??u ????i ngay h??m nay gi???m ?????n <span style="color: red">90%</span> c??c s???n ph???m s???p h???t h???n s??? d???ng</span>
			<span style="margin-left: 950px">&diams; C?? h???i c?? m???t kh??ng hai mua m?? t??m rinh ngay chai n?????c x???</span>
		</marquee>

		<div class="pop_up_order">
			<div class="content">
				<div class="name">
					Th??ng m?? t??m h???o h???o (30 g??i)
				</div>
				<div class="quantity">
					<span style="padding-right: 20px;">S??? l?????ng:</span>
					<div class="icon">
						-
					</div>
					<div class="value">1</div>
					<div class="icon">
						+
					</div>
				</div>
				<div class="option">
					<button class="btn btn-danger" onclick="back()">Quay l???i</button>
					
					<button class="btn btn-primary" style="margin-left: 10px" onclick="success()">Th??m v??o gi??? h??ng</button>
				</div>
			</div>
		</div>

		<div class="list">
			<div class="line_items" style="margin-top: 0px;">
				<div class="items_title">
					<div class="text">S???n ph???m ??n li???n</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">M?? ??n li???n</button>
						<button class="option">Ph???, h??? ti???u, mi???n</button>
						<button class="option">Ch??o g??i, ch??o t????i</button>
						<button class="option">B??nh canh, b??nh ??a</button>
						<button class="direction">&raquo;</button>
					</div>
				</div>
				<div class="items_content">
					<div class="item">
					<!-- image http://thieulamua.com/danh-muc/thuc-pham-an-lien/mi-goi/?orderby=price-desc  -->
						<div class="image">
							<img src="./../img/item_1.jpg">
						</div>
						<div class="info">
							<div class="name">
								 <!--  -->
								Th??ng m?? t??m h???o h???o (30 g??i)
							</div>
							<div class="price">
								110.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/mi_3_mien.jpg"> </div>
						<div class="info">
							<div class="name">
								Th??ng m?? t??m 3 mi???n t??m chua cay (30 g??i)
							</div>
							<div class="price">
								100.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/omachi.jpeg">
						</div>
						<div class="info">
							<div class="name">
								Th??ng m?? omachi v??? ngon kh??ng th??? ch???i t??? (30 g??i)
							</div>
							<div class="price">
								130.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/tien_vua.jpg">
						</div>
						<div class="info">
							<div class="name">
								Th??ng m?? ti???n vua (30 g??i)
							</div>
							<div class="price">
								90.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem th??m</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">????? t????i s???ng</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">Th???t l???n</button>
						<button class="option">G??, tr???ng</button>
						<button class="option">Rau c??? s???ch</button>
						<button class="option">C??, h???i s???n</button>
						<button class="direction">&raquo;</button>
					</div>
				</div>
				<div class="items_content">
					<div class="item">
						<div class="image">
							<img src="./../img/suon-cot-let-cp-khay-500g-202106261037397513_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								S?????n c???t l???t heo HP khay 500g
							</div>
							<div class="price">
								80.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/thit-dui-heo-khay-500g-202009231130582972.jpg">
						</div>
						<div class="info">
							<div class="name">
								Th???t ????i heo khay 500g
							</div>
							<div class="price">
								80.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/thit-heo-xay-cp-khay-500g-202106230130268069_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								Th???t heo xay CP khay 500g
							</div>
							<div class="price">
								79.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/uc-ga-tuoi-phi-le-khay-500g-202105200016488014_300x300.jpeg">
						</div>
						<div class="info">
							<div class="name">
								???c g?? t????i phi l?? khay 500g
							</div>
							<div class="price">
								43.500 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem th??m</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">????? u???ng c??c lo???i</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">N?????c ng???t</button>
						<button class="option">N?????c kho??ng</button>
						<button class="option">Cafe</button>
						<button class="option">Tr?? s???a</button>
						<button class="direction">&raquo;</button>
					</div>
				</div>
				<div class="items_content">
					<div class="item">
						<div class="image">
							<img src="./../img/6-chai-nuoc-ngot-coca-cola-600ml-202103312238301818_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								6 chai n?????c ng???t coca cola 600ml
							</div>
							<div class="price">
								35.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/6-chai-nuoc-ngot-co-ga-fanta-huong-soda-kem-trai-cay-600ml-202103202216192813_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								6 chai n?????c ng???t c?? ga fanta h????ng soda kem tr??i c??y 600ml
							</div>
							<div class="price">
								35.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/6-lon-bia-budweiser-330ml-202103162300251481.jpg">
						</div>
						<div class="info">
							<div class="name">
								6 lon bia budweiser 330ml
							</div>
							<div class="price">
								85.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/loc-6-chai-nuoc-tinh-khiet-lama-350ml-202008191316375614.jpg">
						</div>
						<div class="info">
							<div class="name">
								6 chai n?????c tinh khi???t Lama 350ml
							</div>
							<div class="price">
								18.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem th??m</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">Gia v???, n??m</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">D???u ??n</button>
						<button class="option">N?????c m???m</button>
						<button class="option">B???t chi??n</button>
						<button class="option">N?????c ch???m</button>
						<button class="direction">&raquo;</button>
					</div>
				</div>
				<div class="items_content">
					<div class="item">
						<div class="image">
							<img src="./../img/dau-an-cao-cap-tuong-an-gold-chai-1-lit-202105201324185032.jpg">
						</div>
						<div class="info">
							<div class="name">
								D???u ??n cao c???p T?????ng An Gold chai 1 l??t
							</div>
							<div class="price">
								47.000 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/nuoc-mam-nam-ngu-phu-quoc-32-do-dam-chai-500ml-202104191446122788_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								N?????c m???m nh?? h???o h???ng Nam Ng?? Ph?? Qu???c 32 ????? ?????m chai 500ml
							</div>
							<div class="price">
								55.500 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
					<div class="item">
						<div class="image">
							<img src="./../img/tuong-ot-tron-5-vi-knorr-cay-dam-chai-220g-202010142234533560.jpg">
						</div>
						<div class="info">
							<div class="name">
								T????ng ???t tr??n 5 v??? cay ?????m Knorr chai 220g
							</div>
							<div class="price">
								10.500 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>		
					<div class="item">
						<div class="image">
							<img src="./../img/hat-nem-vi-heo-aji-ngon-goi-900g-202104201420020041_300x300.jpg">
						</div>
						<div class="info">
							<div class="name">
								H???t n??m v??? heo Aji-ngon g??i 900g
							</div>
							<div class="price">
								64.500 ??
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>	
				</div>
				<div class="more_link"><a>Xem th??m</a></div>
			</div>
		</div>
	</div>
	<div class="footer_box">
		<div class="footer_description">
			<div class="footer_description_title">BLOG C???A CH??NG T??I</div>
			<div class="footer_description_content" style="height: 50px">Ch??a c?? b??i vi???t ????? hi???n th???. Vui l??ng v??o trang qu???n tr??? ????? c???u h??nh cho ph???n n??y</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="./../js/base.js"></script>
<script type="text/javascript" src="./../js/home.js"></script>
<script type="text/javascript">
	function add_to_cart() {

		document.querySelector('.pop_up_order').style.display = 'flex';
	}
	function back() {

		document.querySelector('.pop_up_order').style.display = 'none';
	}
	function success() {

		document.querySelector('.pop_up_order').style.display = 'none';
		alert("Th??m v??o gi??? h??ng th??nh c??ng");
	}
</script>
</html>

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
			<input type="text" name="header_search_bar_input" placeholder="Tìm kiếm ...">
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
												Đơn đặt coffee Starbucks.
											</div>
											<div class="sub_title">
												Đang giao hàng, dự kiến còn 10 phút
											</div>
										</div>
										<div class="notify_status">
											<p>Sắp tới</p>
										</div>
									</li>
									<li class="baskin_robbins failed">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												Giảm giá 100% khi mua tại shop Fboy Baskin ngay hôm nay
											</div>
											<div class="sub_title">
												Độc quyền duy nhất 1000% sản phẩm là có thật và 20 bạn may mắn nhất sẽ được đi thăm sở thú hoa cải đỏ
											</div>
										</div>
										<div class="notify_status">
											<p>Đóng</p>
										</div>
									</li>
									<li class="mcd success">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												Đơn mua sách trên MCD đang được chờ duyệt
											</div>
											<div class="sub_title">
												MCD sẽ nhanh chóng thông báo cho bạn sớm nhất.
											</div>
										</div>
										<div class="notify_status">
											<p>Chờ duyệt</p>
										</div>
									</li>
									<li class="pizzahut failed">
										<div class="notify_icon">
											<span class="icon"></span>
										</div>
										<div class="notify_data">
											<div class="title">
												Đơn hàng pizzahut chưa được thanh toán
											</div>
											<div class="sub_title">
												Bạn cần thanh toán online để đặt hàng không tiếp xúc
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
												Đơn hàng gà chiên mắm KFC còn 2 phút tới nơi
											</div>
											<div class="sub_title">
												Bạn chuẩn bị nhận hàng nhé
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
									<li><a href="./profile.html">Tài khoản của tôi</a></li>
									<li><a href="./order_status.html">Đơn mua</a></li>
									<li><a href="./manage_supply.html">Quản lý nhà cung cấp</a></li>
									<li><a href="./manage_employee.html">Quản lý nhân viên</a></li>
									<li><a href="./manage_client.html">Quản lý khách hàng</a></li>
									<li><a href="./confirm.html">Quản lý đơn hàng</a></li>				                    
				                    <li><a href="./manage_product.html">Quản lý sản phẩm</a></li>
				                    <li><a href="./supply.html">Nhập sản phẩm</a></li>			                    
				                    <li><a href="./statistic_goods.html">Thống kê sản phẩm theo doanh thu</a></li>
				                    <li><a href="./statistic_guest.html">Thống kê khách hàng theo doanh thu</a></li>
				                    <li><a href="./statistic_supply.html">Thống kê nhà cung cấp theo lượng sản phẩm nhập</a></li>
				                    <li><a href="./manager_bill.html">Tra cứu thông tin hóa đơn</a></li>
				                    <li><a href="./login.html">Đăng xuất</a></li>
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
			<div class="title">Danh mục sản phẩm</div>
			<div class="item">
				Sản phẩm ăn liền
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Mì ăn liền
					</div>
					<div class="sub_item">
						Phở, hủ tiếu, miến
					</div>
					<div class="sub_item">
						Cháo gói, cháo tươi
					</div>
					<div class="sub_item">
						Bánh canh, bánh đa
					</div>
					<div class="sub_item">
						Lương khô
					</div>
				</div>
			</div>
			<div class="item">
				Đồ tươi sống
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Thịt lợn
					</div>
					<div class="sub_item">
						Gà, trứng
					</div>
					<div class="sub_item">
						Rau củ sạch
					</div>
					<div class="sub_item">
						Cá, hải sản
					</div>
					<div class="sub_item">
						Thịt dê
					</div>
				</div>
			</div>
			<div class="item">
				Đồ uống các loại
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Nước ngọt
					</div>
					<div class="sub_item">
						Nước khoáng
					</div>
					<div class="sub_item">
						Cafe
					</div>
					<div class="sub_item">
						Trà sữa
					</div>
					<div class="sub_item">
						Sữa tươi
					</div>
				</div>
			</div>
			<div class="item">
				Gia vị nêm
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Nước mắm
					</div>
					<div class="sub_item">
						Súp
					</div>
					<div class="sub_item">
						Giầu ăn
					</div>
					<div class="sub_item">
						Bột chiên
					</div>
					<div class="sub_item">
						Nước chấm
					</div>
				</div>
			</div>
			<div class="item">
				Nhà cửa đời sống
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Ly, Cốc, Bình nước
					</div>
					<div class="sub_item">
						Vệ sinh nhà cửa
					</div>
					<div class="sub_item">
						Sửa chữa nhà cửa
					</div>
					<div class="sub_item">
						Trang trí nhà cửa
					</div>
				</div>
			</div>
			<div class="item">
				Chăm sóc thú cưng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Thức ăn thú cưng
					</div>
					<div class="sub_item">
						Đồ dùng cho thú cưng
					</div>
					<div class="sub_item">
						Thuốc hỗ trợ
					</div>
				</div>
			</div>
			<div class="item">
				Đồ chơi
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Đồ chơi điều khiển
					</div>
					<div class="sub_item">
						Đất nặn
					</div>
					<div class="sub_item">
						Gấu bông
					</div>
				</div>				
			</div>
			<div class="item">
				Dụng cụ thể thao
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Gậy gold, giỏ
					</div>
					<div class="sub_item">
						Gym
					</div>
					<div class="sub_item">
						Bóng thể thao
					</div>
					<div class="sub_item">
						Giày thể thao
					</div>
				</div>	
			</div>
			<div class="item">
				Linh kiện điện tử
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Linh kiện máy tính
					</div>
					<div class="sub_item">
						Linh kiện điện thoại
					</div>
					<div class="sub_item">
						Camera
					</div>
				</div>	
			</div>
			<div class="item">
				Dụng cụ học sinh
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Giấy kiểm tra
					</div>
					<div class="sub_item">
						Bút mực, bút bi, bút chì
					</div>
					<div class="sub_item">
						Bàn học
					</div>
					<div class="sub_item">
						Đèn học
					</div>
				</div>	
			</div>
			<div class="item">
				Đồ dùng cá nhân
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Khăn mặt, khăn tắm
					</div>
					<div class="sub_item">
						Keo vuốt tóc
					</div>
					<div class="sub_item">
						Mặt nạ
					</div>
					<div class="sub_item">
						Len
					</div>
				</div>
			</div>
			<div class="item">
				Đồ điện gia dụng
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Quạt
					</div>
					<div class="sub_item">
						Đèn quang, iot
					</div>
					<div class="sub_item">
						Bếp điện, bếp từ
					</div>
					<div class="sub_item">
						Máy tính
					</div>
					<div class="sub_item">
						Tivi
					</div>
				</div>
			</div>
			<div class="item">
				Quà lưu niệm
				<span class="fa">&#xf105;</span>
				<div class="sub_bar">
					<div class="sub_item">
						Lật đật
					</div>
					<div class="sub_item">
						Giỏ quà
					</div>
					<div class="sub_item">
						Bưu thiếp
					</div>
				</div>
			</div>
		</div>
		
		<marquee behavior="scroll" direction="left" class="home_notfication" scrollamount="15">
			<span>&diams; Ưu đãi ngay hôm nay giảm đến <span style="color: red">90%</span> các sản phẩm sắp hết hạn sử dụng</span>
			<span style="margin-left: 950px">&diams; Cơ hội có một không hai mua mì tôm rinh ngay chai nước xả</span>
		</marquee>

		<div class="pop_up_order">
			<div class="content">
				<div class="name">
					Thùng mì tôm hảo hảo (30 gói)
				</div>
				<div class="quantity">
					<span style="padding-right: 20px;">Số lượng:</span>
					<div class="icon">
						-
					</div>
					<div class="value">1</div>
					<div class="icon">
						+
					</div>
				</div>
				<div class="option">
					<button class="btn btn-danger" onclick="back()">Quay lại</button>
					
					<button class="btn btn-primary" style="margin-left: 10px" onclick="success()">Thêm vào giỏ hàng</button>
				</div>
			</div>
		</div>

		<div class="list">
			<div class="line_items" style="margin-top: 0px;">
				<div class="items_title">
					<div class="text">Sản phẩm ăn liền</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">Mì ăn liền</button>
						<button class="option">Phở, hủ tiếu, miến</button>
						<button class="option">Cháo gói, cháo tươi</button>
						<button class="option">Bánh canh, bánh đa</button>
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
								Thùng mì tôm hảo hảo (30 gói)
							</div>
							<div class="price">
								110.000 đ
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
								Thùng mì tôm 3 miền tôm chua cay (30 gói)
							</div>
							<div class="price">
								100.000 đ
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
								Thùng mì omachi vị ngon không thể chối từ (30 gói)
							</div>
							<div class="price">
								130.000 đ
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
								Thùng mì tiến vua (30 gói)
							</div>
							<div class="price">
								90.000 đ
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem thêm</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">Đồ tươi sống</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">Thịt lợn</button>
						<button class="option">Gà, trứng</button>
						<button class="option">Rau củ sạch</button>
						<button class="option">Cá, hải sản</button>
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
								Sườn cốt lết heo HP khay 500g
							</div>
							<div class="price">
								80.000 đ
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
								Thịt đùi heo khay 500g
							</div>
							<div class="price">
								80.000 đ
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
								Thịt heo xay CP khay 500g
							</div>
							<div class="price">
								79.000 đ
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
								Ức gà tươi phi lê khay 500g
							</div>
							<div class="price">
								43.500 đ
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem thêm</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">Đồ uống các loại</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">Nước ngọt</button>
						<button class="option">Nước khoáng</button>
						<button class="option">Cafe</button>
						<button class="option">Trà sữa</button>
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
								6 chai nước ngọt coca cola 600ml
							</div>
							<div class="price">
								35.000 đ
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
								6 chai nước ngọt có ga fanta hương soda kem trái cây 600ml
							</div>
							<div class="price">
								35.000 đ
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
								85.000 đ
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
								6 chai nước tinh khiết Lama 350ml
							</div>
							<div class="price">
								18.000 đ
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>
				</div>
				<div class="more_link"><a>Xem thêm</a></div>
			</div>
			<!-- 4 -->
			<div class="line_items">
				<div class="items_title">
					<div class="text">Gia vị, nêm</div>
					<div class="select">
						<button class="direction">&laquo;</button>
						<button class="option" style="color: #3167eb;">Dầu ăn</button>
						<button class="option">Nước mắm</button>
						<button class="option">Bột chiên</button>
						<button class="option">Nước chấm</button>
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
								Dầu ăn cao cấp Tường An Gold chai 1 lít
							</div>
							<div class="price">
								47.000 đ
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
								Nước mắm nhĩ hảo hạng Nam Ngư Phú Quốc 32 độ đạm chai 500ml
							</div>
							<div class="price">
								55.500 đ
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
								Tương ớt tròn 5 vị cay đậm Knorr chai 220g
							</div>
							<div class="price">
								10.500 đ
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
								Hạt nêm vị heo Aji-ngon gói 900g
							</div>
							<div class="price">
								64.500 đ
							</div>
							<button class="button_to_cart" onclick="add_to_cart()">
								Mua ngay
							</button>
						</div>
					</div>	
				</div>
				<div class="more_link"><a>Xem thêm</a></div>
			</div>
		</div>
	</div>
	<div class="footer_box">
		<div class="footer_description">
			<div class="footer_description_title">BLOG CỦA CHÚNG TÔI</div>
			<div class="footer_description_content" style="height: 50px">Chưa có bài viết để hiển thị. Vui lòng vào trang quản trị để cấu hình cho phần này</div>
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
		alert("Thêm vào giỏ hàng thành công");
	}
</script>
</html>

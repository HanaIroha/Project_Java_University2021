USE [QuanLyNhanSuHaui]
GO
/****** Object:  Table [dbo].[BacLuong]    Script Date: 5/11/2021 10:10:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BacLuong](
	[BacLuong] [int] NOT NULL,
	[HeSoLuong] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[BacLuong] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 5/11/2021 10:10:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[MaCV] [varchar](10) NOT NULL,
	[TenCV] [nvarchar](50) NULL,
	[PhuCap] [float] NULL,
	[BacLuong] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanSu]    Script Date: 5/11/2021 10:10:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanSu](
	[MaNS] [varchar](10) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[QueQuan] [nvarchar](100) NULL,
	[GioiTinh] [bit] NULL,
	[DanToc] [nvarchar](20) NULL,
	[SoDienThoai] [varchar](12) NULL,
	[TrinhDoHocVan] [nvarchar](50) NULL,
	[ChuyenNganh] [nvarchar](50) NULL,
	[MaPB] [varchar](10) NULL,
	[MaCV] [varchar](10) NULL,
	[ChinhTri] [nvarchar](250) NULL,
	[DoanThe] [nvarchar](250) NULL,
	[Anh] [image] NULL,
	[NgayGiaNhap] [date] NULL,
	[SuaCuoi] [nvarchar](50) NULL,
	[CanCuoc] [varchar](20) NULL,
	[LoaiCongChuc] [bit] NULL,
	[HanHopDong] [date] NULL,
 CONSTRAINT [PK__NhanSu__2725D73784D2F873] PRIMARY KEY CLUSTERED 
(
	[MaNS] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhongBan]    Script Date: 5/11/2021 10:10:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhongBan](
	[MaPB] [varchar](10) NOT NULL,
	[TenPB] [nvarchar](50) NULL,
	[SoDienThoaiPB] [varchar](12) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPB] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 5/11/2021 10:10:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[TenTaiKhoan] [varchar](30) NOT NULL,
	[MatKhau] [varchar](30) NOT NULL,
	[Ten] [nvarchar](50) NULL,
	[Anh] [image] NULL,
PRIMARY KEY CLUSTERED 
(
	[TenTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE [dbo].[ChucVu]  WITH CHECK ADD  CONSTRAINT [FK_ChucVu_BacLuong] FOREIGN KEY([BacLuong])
REFERENCES [dbo].[BacLuong] ([BacLuong])
ON DELETE SET NULL
GO
ALTER TABLE [dbo].[ChucVu] CHECK CONSTRAINT [FK_ChucVu_BacLuong]
GO

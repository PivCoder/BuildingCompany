import React, { useEffect, useState } from 'react'
import './Region.css'
import houses from './media/Group 3.png'
import card from './media/Rectangle 32.png'
import { Swiper, SwiperSlide } from 'swiper/react'
import 'swiper/css'
import axios from 'axios'
const Region = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState({
		id: 10,
		name: 'Участок 1',
		description: 'Описание участка...',
		images: 'someFolder',
		status: 'REJECTED',
		address: 'ул. Ленина, 12',
		size: 1000.0,
		electricity: true,
		water: true,
		price: 1000025.0,
	})
	const PlotId = localStorage.getItem('PlotId')

	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/plot/get/${PlotId}`, {})
			.then(response => {
				sethouse(response.data)
			})
			.catch(function (error) {
				console.log(error)
			})
	}
	useEffect(() => {
		if (update) return
		getproduct1()
	}, [update])
	return (
		<>
			<div className='Region'>
				<div className='RegionCard_container'>
					<img src={houses} alt='house' />
					<div className='RegionCard__right'>
						<b>{house.name}</b>
						<span>Адрес: {house.address}</span>
						<p>{house.description}</p>
						<div className='RegionCard__spans'>
							<p>Размер</p>
							<span>{house.size} м2</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Стоимость</p>
							<span>{house.price} рублей</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Электричество</p>
							<span>Проведено</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Водопровод</p>
							<span>Проведен</span>
						</div>
					</div>
				</div>
			</div>
			<div className='RegionSwiper'>
				<div className='RegionSwiper_container'>
					<h2>Изображения</h2>
					<div className='RegionSwiper__swiper'>
						<Swiper
							spaceBetween={40}
							slidesPerView={3}
							onSlideChange={() => console.log('slide change')}
							onSwiper={swiper => console.log(swiper)}
						>
							<SwiperSlide>
								<img src={card} alt='card' />
							</SwiperSlide>
							<SwiperSlide>
								<img src={card} alt='card' />
							</SwiperSlide>
							<SwiperSlide>
								<img src={card} alt='card' />
							</SwiperSlide>
							<SwiperSlide>
								<img src={card} alt='card' />
							</SwiperSlide>
						</Swiper>
					</div>
				</div>
			</div>
		</>
	)
}

export default Region

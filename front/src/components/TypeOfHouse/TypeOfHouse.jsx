import React, { useEffect, useState } from 'react'
import './TypeOfHouse.css'
import houses from './media/Group 3.png'
import card from './media/Rectangle 32.png'
import { Swiper, SwiperSlide } from 'swiper/react'
import 'swiper/css'
import axios from 'axios'
const TypeOfHouse = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState({
		id: 1,
		name: 'Дом 1',
		description: 'Описание дома...',
		images: 'someFolder',
		image: '',
		status: 'WAITING',
		area: 132.5,
		heatedArea: 100.19999694824219,
		numberOfFloors: 1,
		houseType: {
			id: 1,
			name: 'Дом с террасой',
			hibernateLazyInitializer: {},
		},
		materialType: {
			id: 1,
			name: 'Керамический кирпич',
			hibernateLazyInitializer: {},
		},
		percentageOfReadiness: 'PERCENT_50',
	})
	const HouseId = localStorage.getItem('houseId')

	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/house/get/${HouseId}`, {})
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
		console.log(house)
	}, [update])
	return (
		<>
			<div className='Region'>
				<div className='RegionCard_container'>
					<img src={houses} alt='house' />
					<div className='RegionCard__right'>
						<b>{house.name}</b>
						<p>{house.description}</p>
						<div className='RegionCard__spans'>
							<p>Материалы</p>
							<span>{house.materialType.name}</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Площадь дома</p>
							<span>{house.heatedArea} м2</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Количество этажей</p>
							<span>{house.numberOfFloors}</span>
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

export default TypeOfHouse

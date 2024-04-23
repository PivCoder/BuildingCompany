import React, { useEffect, useState } from 'react'
import './CompletedProjects.css'
import { Swiper, SwiperSlide } from 'swiper/react'
import 'swiper/css'
import HouseSwiperCard from './HouseSwiperCard/HouseSwiperCard'
import axios from 'axios'

const CompletedProjects = () => {
	const [update, setUpdate] = useState(false)
	const [house, sethouse] = useState([])
	async function getproduct1() {
		axios
			.get(`http://localhost:8087/rest/plot/get`, {})
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
			<div className='CompletedProjects'>
				<div className='CompletedProjects_container'>
					<h2>Реализованные проекты</h2>
					<div className='CompletedProjects_swiper'>
						<Swiper
							spaceBetween={50}
							slidesPerView={3}
							onSlideChange={() => console.log('slide change')}
							onSwiper={swiper => console.log(swiper)}
						>
							{house.map((house, index) => (
								<SwiperSlide>
									<HouseSwiperCard
										number={index + 1}
										house={house}
										key={house.id}
									/>
								</SwiperSlide>
							))}
						</Swiper>
					</div>
				</div>
			</div>
		</>
	)
}

export default CompletedProjects

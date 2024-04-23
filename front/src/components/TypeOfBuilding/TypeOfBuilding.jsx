import React from 'react'
import './TypeOfBuilding.css'
import house from './media/Group 3.png'
import card from './media/Rectangle 32.png'
import { Swiper, SwiperSlide } from 'swiper/react'
import 'swiper/css'
const TypeOfBuilding = () => {
	return (
		<>
			<div className='Region'>
				<div className='RegionCard_container'>
					<img src={house} alt='house' />
					<div className='RegionCard__right'>
						<b>Тип дома</b>
						<span>Село Глухое</span>
						<p>
							Прекрасный загородный дом, расположенный в живописном уголке
							природы, представляет собой идеальное место для уединения и отдыха
							от городской суеты.
						</p>
						<div className='RegionCard__spans'>
							<p>Размер</p>
							<span>258.30 м2</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Стоимость</p>
							<span>5000 рублей</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Электричество</p>
							<span>Проведено</span>
						</div>
						<div className='RegionCard__spans'>
							<p>Электричество</p>
							<span>Проведено</span>
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

export default TypeOfBuilding

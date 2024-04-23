import React from 'react'
import './HouseSwiperCard.css'
import house from './media/house.png'

const HouseSwiperCard = props => {
	return (
		<>
			<div className='HouseSwiperCard'>
				<img src={house} alt='house' />
				<div className='HouseSwiperCard__text'>
					<b>{props.house.name}</b>
					<div className='HouseSwiperCard__spans'>
						<span>{props.house.heatedArea}</span>
						<span>Площадь {props.house.area}</span>
					</div>
					<p>{props.house.description}</p>
				</div>
			</div>
		</>
	)
}

export default HouseSwiperCard

import React from 'react'
import './PlotCard.css'
import house from './media/house.png'
import { Link } from 'react-router-dom'

const PlotCard = props => {
	return (
		<>
			<div className='HouseCard'>
				<img src={house} alt='house' />
				<div className='HouseCard-info'>
					<b>{props.house.name}</b>
					<span>Адрес: {props.house.address} </span>
					<p>{props.house.description}</p>
					<Link
						onClick={() => localStorage.setItem('PlotId', props.house.id)}
						to={'/Region'}
					>
						<button>Подробнее</button>
					</Link>
				</div>
			</div>
		</>
	)
}

export default PlotCard

import React, { useEffect, useState } from 'react'
import './HouseCard.css'
import house from './media/house.png'
import { Link } from 'react-router-dom'

const HouseCard = props => {
	const [update, setUpdate] = useState(false)
	// useEffect(() => {
	// 	if (update) return
	// 	console.log(props.house.id)
	// }, [update])
	return (
		<>
			<div className='HouseCard'>
				<img src={house} alt='house' />
				<div className='HouseCard-info'>
					<b>{props.house.name}</b>
					<span>Площадь {props.house.area} </span>
					<p>{props.house.description}</p>
					<Link
						onClick={() => localStorage.setItem('houseId', props.house.id)}
						to={'/TypeOfHouse'}
					>
						<button>Подробнее</button>
					</Link>
				</div>
			</div>
		</>
	)
}

export default HouseCard

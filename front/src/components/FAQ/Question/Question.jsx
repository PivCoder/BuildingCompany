import React from 'react'
import './Question.css'
import arrow from './media/arrow_drop_down.png'
const Question = () => {
	return (
		<>
			<div className='Question'>
				<div className='question__top'>
					<span>
						Как производится оплата по договору и какой порядок платежей?
					</span>
					<img src={arrow} alt='arrow' />
				</div>
				<div className='question__bottom'>
					<span></span>
				</div>
			</div>
		</>
	)
}

export default Question

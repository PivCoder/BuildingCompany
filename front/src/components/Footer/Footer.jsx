import React from 'react'
import './Footer.css'
import logo from './media/logo.png'
const Footer = () => {
	return (
		<>
			<div className='Footer'>
				<div className='Footer_container'>
					<img src={logo} alt='logo' />
					<input type='text' />
					<div className='Footer-right'>
						<span>
							+7********** / +7********** <br /> ***********@mail.ru <br />
							г. Самара
						</span>
					</div>
				</div>
			</div>
		</>
	)
}

export default Footer

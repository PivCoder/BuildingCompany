import React from 'react'
import './Feedback.css'
import geo from './media/geo.png'
import mail from './media/mail.png'
import phone from './media/phone.png'
import tg from './media/tg.png'
import vb from './media/vb.png'
import wt from './media/wt.png'
const Feedback = () => {
	return (
		<>
			<div className='Feedback'>
				<div className='Feedback-container'>
					<div className='Feedback-right'>
						<h3>Связаться с нами</h3>
						<div className='form'>
							<form action='' method='post'>
								<div className='form_container'>
									<span>Сообщение</span>
									<div className='form__input-box'>
										<input type='text' />
										<input type='text' />
									</div>
									<textarea name='' cols='30' rows='10'></textarea>
									<button>Отправить</button>
								</div>
							</form>
						</div>
					</div>
					<div className='Feedback-left'>
						<h3>Контакты</h3>
						<div className='Feedback-left__mail'>
							<img src={mail} alt='mail' />
							<span>***********@mail.ru</span>
						</div>
						<div className='Feedback-left__phone'>
							<img src={phone} alt='phone' />
							<div className='spans'>
								<span>+7********** / +7**********</span>
								<span>Время работы: круглосуточно</span>
							</div>
						</div>
						<div className='Feedback-left__geo'>
							<img src={geo} alt='geo' />
							<div className='spans'>
								<span>г. Самара</span>
								<span>Улица Пушкина, дом Колотушкина</span>
							</div>
						</div>
						<span>Работы производим по Самарской области</span>
						<div className='Feedback-left__contactBox'>
							<img src={wt} alt='wt' />
							<img src={vb} alt='vb' />
						</div>
					</div>
				</div>
			</div>
		</>
	)
}

export default Feedback

package meeting3.ex8.logging

import meeting3.ex8.logging.log4lectures.Logger

Logger logger = new Logger()
logger.info 'hello, information is here'
logger.warn 'warning, something weird happens'
logger.error 'error, error in the system, recovering...'
package modeling {
	object LinearRegression {
		def main(args: Array[String]){
			println("This is LinearRegression object!")
		}
		def linearRegression(y:List, X:List) : LmModel = {
			"""
				input: y and X
				return a LmModel class
			"""
		}

		class LmModel extends Model {

		}
	}

	class Model{
		def parameters()

		def validate()

		def predict()
	}

	object Validation {

	}
}
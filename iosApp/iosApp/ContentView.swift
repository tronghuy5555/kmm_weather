import SwiftUI
import shared
import shared_lib

struct ContentView: View {
	let greet = Greeting().greet()
    let sharedLibGreet = SharedLibGreeting().greet()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

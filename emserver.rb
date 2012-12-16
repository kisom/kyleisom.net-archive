require 'rubygems'
require 'eventmachine'
require 'sinatra/base'
require 'sinatra'

index_file = "../index.html"

class WebService < Sinatra::Base
  get "/" do
    File.open(index_file) {|f| f.read}
  end
end

EM.run {
  EventMachine.add_periodic_timer(1) do
    puts "hello"
  end
  Sinatra.new {
    WebService.run!
  }
}

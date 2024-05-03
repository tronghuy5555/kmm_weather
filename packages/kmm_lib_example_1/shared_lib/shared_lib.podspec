Pod::Spec.new do |spec|
    spec.name                     = 'shared_lib'
    spec.version                  = '1.0'
    spec.homepage                 = 'Link to the Shared Module homepage'
    spec.source                   = { :http=> ''}
    spec.authors                  = ''
    spec.license                  = ''
    spec.summary                  = 'Some description for the Shared Module'
    spec.vendored_frameworks      = 'build/XCFrameworks/release/shared_lib.xcframework'
    spec.libraries                = 'c++'
    spec.ios.deployment_target = '16.0'

end
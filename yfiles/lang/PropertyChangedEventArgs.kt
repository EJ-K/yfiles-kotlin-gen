// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.lang

/**
 * Event arguments which contain information for a [property-changed][IPropertyObservable] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PropertyChangedEventArgs">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @param [propertyName] The name of the changed property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PropertyChangedEventArgs%23PropertyChangedEventArgs-constructor-PropertyChangedEventArgs">Online Documentation</a>
 * 
 * @property propertyName
 * The name of the changed property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PropertyChangedEventArgs%23propertyName">Online Documentation</a>
 */
external class PropertyChangedEventArgs (
final val propertyName: String) : EventArgs {
  
  companion object : ClassMetadata<PropertyChangedEventArgs> {
  }
}

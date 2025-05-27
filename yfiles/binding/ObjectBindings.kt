// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A container for providers for specified properties of an object that provide the values that can later be [applied][applyBindings] to these properties.
 * @param [TDataItem] The type of the data item these bindings will use to resolve the values from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObjectBindings">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObjectBindings%23ObjectBindings-constructor-ObjectBindings">Online Documentation</a>
 */
external open class ObjectBindings<TDataItem>  () : YObject {

/**
 * Registers another binding between the property with the `propertyName` and a `provider` that provides the value for this property.
 * @param [TValue] The type of the property.
 * @param [propertyName] The name of the property.
 * @param [provider] The provider that will be evaluated during [applyBindings].
 * @see [applyBindings]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObjectBindings%23ObjectBindings-method-addBinding">Online Documentation</a>
 */
 final   fun <TValue>addBinding( propertyName: String ,
 provider: Provider<TDataItem, TValue> )
/**
 * Applies all bindings [added][addBinding] earlier to the `target` using the `dataItem` in the provider of the binding.
 * @param [target] The target object to whose properties the bindings shall be applied.
 * @param [dataItem] The data item the provider of each binding is called with.
 * @see [addBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ObjectBindings%23ObjectBindings-method-applyBindings">Online Documentation</a>
 */
 open protected   fun applyBindings( target: Any ,
 dataItem: TDataItem )

companion object : ClassMetadata<ObjectBindings<*>> {
}
}

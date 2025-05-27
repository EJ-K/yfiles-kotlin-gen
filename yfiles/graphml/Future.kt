// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.ClassMetadata
import yfiles.lang.IPropertyObservable
import yfiles.lang.PropertyChangedEventHandler
import yfiles.lang.YObject

/**
 * A helper holder class that can contain a [value] of a specific type.
 * @param [T] The type of the [value]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Future">Online Documentation</a>
 */
external  class Future<T : YObject> 
private constructor () : IPropertyObservable {

/**
 * Gets a value indicating whether this instance has been [assigned][onValueDetermined] a [value].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Future%23hasValue">Online Documentation</a>
 */
final val hasValue: Boolean
/**
 * Gets the value of this future, which may only be queried if [hasValue] yields `true`.
 * @throws InvalidOperationError If this property is queried although [hasValue] returns `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Future%23value">Online Documentation</a>
 */
final val value: T?
/**
 * Called when the [value] property of this future has been determined.
 * @param [value] The value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Future%23Future-method-onValueDetermined">Online Documentation</a>
 */
 final   fun onValueDetermined( value: T? )
/**
 * Occurs when a property value changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Future%23PropertyChanged">Online Documentation</a>
 */
override fun addPropertyChangedListener(listener: PropertyChangedEventHandler)
override fun removePropertyChangedListener(listener: PropertyChangedEventHandler)

companion object : ClassMetadata<Future<*>> {
}
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import js.objects.ReadonlyRecord
import yfiles.lang.ICloneable
import yfiles.lang.InterfaceMetadata

/**
 * Defines a state that can be used to [determine the location of a port][IPortLocationModel.getLocation] with a [IPortLocationModel].
 * @see [IPortLocationModel]
 * @see [IPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter">Online Documentation</a>
 */
external interface IPortLocationModelParameter : ICloneable<IPortLocationModelParameter> {
/**
 * Gets the model that created this parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter%23model">Online Documentation</a>
 */
val model: IPortLocationModel
/**
 * Determines whether this parameter can be used for ports at the given `owner`.
 * @param [owner] The port owner to test.
 * @return `true` if this instance can be used for ports of the given port owner, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter%23IPortLocationModelParameter-method-supports">Online Documentation</a>
 */
 infix   fun supports( owner: IPortOwner ):Boolean

companion object : InterfaceMetadata<IPortLocationModelParameter> {
/**
 * Deserializes a JavaScript object which has been created by [serializeParameter].
 * @param [serializedData] The JavaScript object to deserialize.
 * @return The deserialized parameter.
 * @throws Error if the given `serializedData` could not be deserialized.
 * @see [serializeParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter%23IPortLocationModelParameter-defaultmethod-deserializeParameter">Online Documentation</a>
 */
   fun deserializeParameter( serializedData: Any ):IPortLocationModelParameter
/**
 * Serializes the given [IPortLocationModelParameter] into a JavaScript object from which the parameter can be restored.
 * @param [parameter] The [IPortLocationModelParameter] instance to serialize.
 * @return A JavaScript object from which the parameter can be restored.
 * @see [deserializeParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortLocationModelParameter%23IPortLocationModelParameter-defaultmethod-serializeParameter">Online Documentation</a>
 */
   fun serializeParameter( parameter: IPortLocationModelParameter ):ReadonlyRecord<String, *>
}
}

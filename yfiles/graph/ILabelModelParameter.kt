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
 * Defines a state that can be used to [determine the geometry of a label][ILabelModel.getGeometry] with a [ILabelModel].
 * @see [ILabelModel]
 * @see [ILabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter">Online Documentation</a>
 */
external interface ILabelModelParameter : ICloneable<ILabelModelParameter> {
/**
 * Gets the model that can be used to determine the geometry of a label given this parameter and a label instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter%23model">Online Documentation</a>
 */
val model: ILabelModel
/**
 * Determines whether this parameter can be used for a given label instance.
 * @param [label] The label to test.
 * @return `true` if this instance can be used for the given label, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter%23ILabelModelParameter-method-supports">Online Documentation</a>
 */
 infix   fun supports( label: ILabel ):Boolean

companion object : InterfaceMetadata<ILabelModelParameter> {
/**
 * Deserializes a JavaScript object which has been created by [serializeParameter].
 * @param [serializedData] The JavaScript object to deserialize.
 * @return The deserialized parameter.
 * @throws Error if the given `serializedData` could not be serialized.
 * @see [serializeParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter%23ILabelModelParameter-defaultmethod-deserializeParameter">Online Documentation</a>
 */
   fun deserializeParameter( serializedData: Any ):ILabelModelParameter
/**
 * Serializes the given [ILabelModelParameter] into a JavaScript object from which the parameter can be restored.
 * @param [parameter] The [ILabelModelParameter] instance to serialize.
 * @return A JavaScript object from which the parameter can be restored.
 * @see [deserializeParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameter%23ILabelModelParameter-defaultmethod-serializeParameter">Online Documentation</a>
 */
   fun serializeParameter( parameter: ILabelModelParameter ):ReadonlyRecord<String, *>
}
}

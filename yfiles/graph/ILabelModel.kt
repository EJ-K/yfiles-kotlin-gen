// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IOrientedRectangle
import yfiles.lang.InterfaceMetadata

/**
 * Defines the geometry of [ILabel] instances with respect to specific [ILabelModelParameter]s.
 * @see [ILabelModelParameter]
 * @see [ILabel]
 * @see [IGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModel">Online Documentation</a>
 */
external interface ILabelModel : ILookup {
/**
 * Creates a default parameter that can be used for this model.
 * @return a parameter for this model instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModel%23ILabelModel-method-createDefaultParameter">Online Documentation</a>
 */
   fun createDefaultParameter():ILabelModelParameter
/**
 * Provides a [lookup context][ILookup] for the given combination of label and parameter.
 * @param [label] The label to use in the context.
 * @param [layoutParameter] The parameter to use for the label in the context.
 * @return An implementation of the [ILookup] interface that can be used to query additional aspects of the label/parameter combination.
 * @see [ILookup.EMPTY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModel%23ILabelModel-method-getContext">Online Documentation</a>
 */
   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * Calculates the [geometry][IOrientedRectangle] of the given label using the given model parameter.
 * @param [label] The label to calculate the geometry for.
 * @param [layoutParameter] A parameter that is compatible with this model. Typically, this is a parameter that has been created by this model, and its property [ILabelModelParameter.model] returns this instance.
 * @return An [IOrientedRectangle] that describes the geometry of the label. This is typically designed as a flyweight, therefore clients should not cache the instance but store the values if they need a snapshot for later use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModel%23ILabelModel-method-getGeometry">Online Documentation</a>
 */
   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle

companion object : InterfaceMetadata<ILabelModel> {
}
}

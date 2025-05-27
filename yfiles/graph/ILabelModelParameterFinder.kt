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
import yfiles.lang.YObject

/**
 * Implementations can be used to find the best [ILabelModelParameter] to approximate a given layout for a given [ILabelModel].
 * @see [DefaultLabelModelParameterFinder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder">Online Documentation</a>
 */
external interface ILabelModelParameterFinder : YObject {
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance.
 * @param [label] The label to find a parameter for.
 * @param [model] The model instance to use. This should be the instance this instance has been obtained from.
 * @param [layout] The anticipated layout for the label.
 * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder%23ILabelModelParameterFinder-method-findBestParameter">Online Documentation</a>
 */
   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter

companion object : InterfaceMetadata<ILabelModelParameterFinder> {

/**
 * Creates an implementation of the interface [ILabelModelParameterFinder] by using the given function as implementation for its [findBestParameter] method.
 * @param [findBestParameter] A function for [ILabelModelParameterFinder]'s single abstract method [findBestParameter].
 * @return An instance of the [ILabelModelParameterFinder] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterFinder%23ILabelModelParameterFinder-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                findBestParameter: (
            label: ILabel,
model: ILabelModel,
layout: IOrientedRectangle
            ) -> ILabelModelParameter 
            ):ILabelModelParameterFinder
}
}

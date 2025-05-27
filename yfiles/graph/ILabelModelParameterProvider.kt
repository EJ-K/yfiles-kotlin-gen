// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Helper interface used by [ILabelModel] implementations to provide possible candidate [ILabelModelParameter]s for a given label and model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider">Online Documentation</a>
 */
external interface ILabelModelParameterProvider : YObject {
/**
 * Returns an enumerator over a set of possible [ILabelModelParameter] instances that can be used for the given label and model.
 * @param [label] The label instance to use.
 * @param [model] The model to provide parameters for.
 * @return A possibly empty enumerator over a set of label model parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider%23ILabelModelParameterProvider-method-getParameters">Online Documentation</a>
 */
   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>

companion object : InterfaceMetadata<ILabelModelParameterProvider> {

/**
 * Creates an implementation of the interface [ILabelModelParameterProvider] by using the given function as implementation for its [getParameters] method.
 * @param [getParameters] A function for [ILabelModelParameterProvider]'s single abstract method [getParameters].
 * @return An instance of the [ILabelModelParameterProvider] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelModelParameterProvider%23ILabelModelParameterProvider-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                getParameters: (
            label: ILabel,
model: ILabelModel
            ) -> IEnumerable<ILabelModelParameter> 
            ):ILabelModelParameterProvider
}
}

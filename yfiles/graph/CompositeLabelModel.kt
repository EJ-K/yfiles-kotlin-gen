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
import yfiles.collections.IList
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An implementation of [ILabelModel] that can be used to create custom label models out of existing [ILabelModel] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this label model with an empty [labelModels] collection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-constructor-CompositeLabelModel">Online Documentation</a>
 */
external open class CompositeLabelModel  () : ILabelModel, ILabelModelParameterProvider, ILabelModelParameterFinder {

/**
 * Gets a list of [ILabelModel] implementations that are wrapped by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23labelModels">Online Documentation</a>
 */
final val labelModels: IList<out ILabelModel>
/**
 * Creates a default parameter that can be used for this model.
 * @return a parameter for this model instance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance.
 * @param [label] The label to find a parameter for.
 * @param [model] The model instance to use. This should be the instance this instance has been obtained from.
 * @param [layout] The anticipated layout for the label.
 * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * Returns an enumerator over a set of possible [ILabelModelParameter] instances that can be used for the given label and model.
 * @param [label] The label instance to use.
 * @param [model] The model to provide parameters for.
 * @return A possibly empty enumerator over a set of label model parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-getParameters">Online Documentation</a>
 */
 final override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CompositeLabelModel%23CompositeLabelModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<CompositeLabelModel> {
}
}

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
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * An implementation of [ILabelModel] that can be used to create custom label models out of existing [ILabelModelParameter] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel">Online Documentation</a>
 * 
 * @constructor Create a new generic label model using the provided parameter as the [default parameter.][createDefaultParameter]
 * @param [defaultLayoutParameter] The parameter to use as the default.
 * @param [descriptor] The descriptor to associate with the parameter.
 * @see [getDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-constructor-GenericLabelModel">Online Documentation</a>
 */
external open class GenericLabelModel  ( defaultLayoutParameter: ILabelModelParameter ,
 descriptor: ILabelCandidateDescriptor?  = definedExternally) : ILabelModel, ILabelModelParameterProvider, ILabelCandidateDescriptorProvider {

/**
 * Adds another parameter to this models collection of parameters.
 * @param [layoutParameter] The parameter to add to this instance.
 * @param [descriptor] The descriptor to associate with the parameter.
 * @return A new parameter that wraps the provided parameter and uses this instance as its model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-addParameter">Online Documentation</a>
 */
 final   fun addParameter( layoutParameter: ILabelModelParameter ,
 descriptor: ILabelCandidateDescriptor?  = definedExternally):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * Yields the [ILabelCandidateDescriptor] that has been associated with the instance during [addParameter].
 * @param [label] The label instance to use.
 * @param [layoutParameter] The parameter to get the descriptor for.
 * @return The descriptor instance that had been added to this instance during [addParameter].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-getDescriptor">Online Documentation</a>
 */
 override   fun getDescriptor( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILabelCandidateDescriptor?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-getParameters">Online Documentation</a>
 */
 final override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabelModel%23GenericLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<GenericLabelModel> {
}
}

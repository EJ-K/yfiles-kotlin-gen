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
 * A label model that wraps an existing label model and decorates it with a [descriptor][ILabelCandidateDescriptor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DescriptorWrapperLabelModel] class.
 * @param [innerModel] The wrapped label model or [FreeLabelModel] if not specified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-constructor-DescriptorWrapperLabelModel">Online Documentation</a>
 * 
 * @property innerModel
 * Gets or sets the inner label model
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23innerModel">Online Documentation</a>
 */
external open class DescriptorWrapperLabelModel  (
final var innerModel: ILabelModel = definedExternally) : ILabelModel, ILabelCandidateDescriptorProvider, ILabelModelParameterProvider {

/**
 * Gets or sets the descriptor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23descriptor">Online Documentation</a>
 */
final var descriptor: ILabelCandidateDescriptor?
/**
 * Creates a default parameter that can be used for this model.
 * @return The default parameter from [innerModel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-getContext">Online Documentation</a>
 */
 final override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-getDescriptor">Online Documentation</a>
 */
 final override   fun getDescriptor( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILabelCandidateDescriptor?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-getParameters">Online Documentation</a>
 */
 final override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DescriptorWrapperLabelModel%23DescriptorWrapperLabelModel-method-lookup">Online Documentation</a>
 */
 final override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<DescriptorWrapperLabelModel> {
}
}

inline fun DescriptorWrapperLabelModel(
    block: DescriptorWrapperLabelModel.() -> Unit
): DescriptorWrapperLabelModel {
    return DescriptorWrapperLabelModel()
        .apply(block)
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.ClassMetadata

/**
 * An implementation of the [ILabelCandidateDescriptorProvider] interface that always yields a constant [ILabelCandidateDescriptor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstantLabelCandidateDescriptorProvider">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ConstantLabelCandidateDescriptorProvider] class that always yields `descriptor` in [getDescriptor].
 * @param [descriptor] The descriptor to yield in [getDescriptor].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstantLabelCandidateDescriptorProvider%23ConstantLabelCandidateDescriptorProvider-constructor-ConstantLabelCandidateDescriptorProvider">Online Documentation</a>
 */
external  class ConstantLabelCandidateDescriptorProvider  ( descriptor: ILabelCandidateDescriptor? ) : ILabelCandidateDescriptorProvider {

/**
 * Always yields the parameter that has been passed to the constructor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstantLabelCandidateDescriptorProvider%23ConstantLabelCandidateDescriptorProvider-method-getDescriptor">Online Documentation</a>
 */
 final override   fun getDescriptor( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILabelCandidateDescriptor?

companion object : ClassMetadata<ConstantLabelCandidateDescriptorProvider> {
/**
 * A sharable implementation of the [ILabelCandidateDescriptorProvider] interface that always yields [LabelCandidateDescriptor.EXTERNAL_DESCRIPTOR].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstantLabelCandidateDescriptorProvider%23EXTERNAL_DESCRIPTOR_PROVIDER">Online Documentation</a>
 */
 val EXTERNAL_DESCRIPTOR_PROVIDER: ILabelCandidateDescriptorProvider
/**
 * A sharable implementation of the [ILabelCandidateDescriptorProvider] interface that always yields [LabelCandidateDescriptor.INTERNAL_DESCRIPTOR].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstantLabelCandidateDescriptorProvider%23INTERNAL_DESCRIPTOR_PROVIDER">Online Documentation</a>
 */
 val INTERNAL_DESCRIPTOR_PROVIDER: ILabelCandidateDescriptorProvider
}
}

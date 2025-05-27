// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An interface that can be used to retrieve [ILabelCandidateDescriptor] instances for a given pair of a [ILabel] and a [candidate parameter][ILabelModelParameter].
 * @see [ILabelCandidateDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptorProvider">Online Documentation</a>
 */
external interface ILabelCandidateDescriptorProvider : YObject {
/**
 * Gets the descriptor for a given pair of a label and a [ILabelModelParameter].
 * @param [label] The label to possibly assign the `layoutParameter`.
 * @param [layoutParameter] The parameter to provide a descriptor for if applied to the given `label`.
 * @return A descriptor or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ILabelCandidateDescriptorProvider%23ILabelCandidateDescriptorProvider-method-getDescriptor">Online Documentation</a>
 */
   fun getDescriptor( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILabelCandidateDescriptor?

companion object : InterfaceMetadata<ILabelCandidateDescriptorProvider> {
}
}

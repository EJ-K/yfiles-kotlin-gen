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
 * A mutable implementation of the [ILabelCandidateDescriptor] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a [LabelCandidateDescriptor] with the default values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23LabelCandidateDescriptor-constructor-LabelCandidateDescriptor">Online Documentation</a>
 */
external open class LabelCandidateDescriptor  () : ILabelCandidateDescriptor {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23edgeOverlapPenalty">Online Documentation</a>
 */
final override var edgeOverlapPenalty: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23externalCandidate">Online Documentation</a>
 */
final override var externalCandidate: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23nodeOverlapPenalty">Online Documentation</a>
 */
final override var nodeOverlapPenalty: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23profit">Online Documentation</a>
 */
final override var profit: Double

companion object : ClassMetadata<LabelCandidateDescriptor> {
/**
 * A sharable immutable implementation of the [ILabelCandidateDescriptor] interface that has penalties of `1.0` and a profit of `1.0` and yields `true` for the [ILabelCandidateDescriptor.externalCandidate] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23EXTERNAL_DESCRIPTOR">Online Documentation</a>
 */
 val EXTERNAL_DESCRIPTOR: ILabelCandidateDescriptor
/**
 * A sharable immutable implementation of the [ILabelCandidateDescriptor] interface that has penalties of `1.0` and a profit of `1.0` and yields `false` for the [ILabelCandidateDescriptor.externalCandidate] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelCandidateDescriptor%23INTERNAL_DESCRIPTOR">Online Documentation</a>
 */
 val INTERNAL_DESCRIPTOR: ILabelCandidateDescriptor
}
}

inline fun LabelCandidateDescriptor(
    block: LabelCandidateDescriptor.() -> Unit
): LabelCandidateDescriptor {
    return LabelCandidateDescriptor()
        .apply(block)
}

// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * An [IProfitModel] that returns the profit of a label candidate for instances of [ExtendedNodeLabelCandidate] and [ExtendedEdgeLabelCandidate].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedLabelCandidateProfitModel">Online Documentation</a>
 */
external open class ExtendedLabelCandidateProfitModel  : IProfitModel {

/**
 * Returns the profit for placing a label-candidate.
 * @param [candidate] a label candidate
 * @return a value between 0 and 1.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedLabelCandidateProfitModel%23ExtendedLabelCandidateProfitModel-method-getProfit">Online Documentation</a>
 */
 final override   fun getProfit( candidate: LabelCandidate ):Double

companion object : ClassMetadata<ExtendedLabelCandidateProfitModel> {
}
}

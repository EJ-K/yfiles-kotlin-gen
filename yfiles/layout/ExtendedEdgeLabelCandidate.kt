// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.geometry.OrientedRectangle
import yfiles.labeling.LabelCandidate
import yfiles.lang.ClassMetadata

/**
 * A [LabelCandidate] that is associated with a label model parameter.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate">Online Documentation</a>
 * 
 * @constructor Returns a new instance of [ExtendedEdgeLabelCandidate].
 * @param [orientedBox] the label size and orientation
 * @param [parameter] the parameters of the labeling model associated with this candidate.
 * @param [allowOwnerOverlap] flag whether the candidate is allowed to overlap the layout of the edge.
 * @param [weight] the weight associated with the label candidate
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23ExtendedEdgeLabelCandidate-constructor-ExtendedEdgeLabelCandidate">Online Documentation</a>
 * 
 * @property parameter
 * Gets the model parameter that was used by the underlying model to generate this label candidate.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ExtendedEdgeLabelCandidate%23parameter">Online Documentation</a>
 */
external class ExtendedEdgeLabelCandidate (
orientedBox: OrientedRectangle,
final val parameter: Any,
allowOwnerOverlap: Boolean,
weight: Double  = definedExternally) : LabelCandidate {
  
  companion object : ClassMetadata<ExtendedEdgeLabelCandidate> {
  }
}

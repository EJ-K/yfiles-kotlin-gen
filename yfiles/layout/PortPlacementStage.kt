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
 * The [PortPlacementStage] assigns edges to the ports specified by [PortConstraint]s or [PortCandidate]s after calling the [core layout algorithm][LayoutStageBase.coreLayout].
 * @see [PortConstraint]
 * @see [PortCandidate]
 * @see [PortCandidateSet]
 * @see [pathCorrection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage">Online Documentation</a>
 * 
 * @constructor Creates a new [PortPlacementStage] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23PortPlacementStage-constructor-PortPlacementStage">Online Documentation</a>
 */
external open class PortPlacementStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not this [ILayoutStage] corrects the edge paths after moving the port to the location specified by a [PortConstraint] or [PortCandidate]s.
 * 
 * Default value - `false`. Edge paths are not orthogonally corrected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23pathCorrection">Online Documentation</a>
 */
open var pathCorrection: Boolean
/**
 * Corrects the ports of the edges considering [PortConstraint]s and [PortCandidate]s.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortPlacementStage%23PortPlacementStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<PortPlacementStage> {
}
}

inline fun PortPlacementStage(
    block: PortPlacementStage.() -> Unit
): PortPlacementStage {
    return PortPlacementStage()
        .apply(block)
}

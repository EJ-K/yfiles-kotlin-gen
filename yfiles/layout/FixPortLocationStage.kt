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
 * [FixPortLocationStage] ensures that layout algorithms that cannot handle port constraints keep the ports of edges with strong [PortConstraint]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStage">Online Documentation</a>
 * 
 * @constructor Creates a new [FixPortLocationStage] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStage%23FixPortLocationStage-constructor-FixPortLocationStage">Online Documentation</a>
 */
external open class FixPortLocationStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not the final edge routes should contain the ports calculated by the [core layout algorithm][LayoutStageBase.coreLayout].
 * 
 * Default value - `true`. The edge paths contain the port locations calculated by the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStage%23keepCalculatedPorts">Online Documentation</a>
 */
open var keepCalculatedPorts: Boolean
/**
 * Restores the locations of strong [PortConstraint]s after invoking the [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FixPortLocationStage%23FixPortLocationStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<FixPortLocationStage> {
}
}

inline fun FixPortLocationStage(
    block: FixPortLocationStage.() -> Unit
): FixPortLocationStage {
    return FixPortLocationStage()
        .apply(block)
}

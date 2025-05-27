// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.INodeMap
import yfiles.lang.ClassMetadata

/**
 * A special [ComponentLayout] implementation that allows to lay out isolated subgraphs within a group as separate components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IsolatedGroupComponentLayout">Online Documentation</a>
 * 
 * @constructor Creates an instance of [IsolatedGroupComponentLayout] with the given layout algorithm as [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] the core layout algorithm that will be invoked for each component of the graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IsolatedGroupComponentLayout%23IsolatedGroupComponentLayout-constructor-IsolatedGroupComponentLayout">Online Documentation</a>
 */
external open class IsolatedGroupComponentLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : ComponentLayout {

/**
 * Calculates the layout based on the current [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IsolatedGroupComponentLayout%23IsolatedGroupComponentLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Determines the nodes that belong to the same graph component.
 * @param [graph] the input graph
 * @param [compNumber] the [INodeMap] that will be filled by the layout algorithm, such that it contains the zero-based index of the component number to which each node belongs
 * @return the number of separate components
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IsolatedGroupComponentLayout%23IsolatedGroupComponentLayout-method-findIsolatedGraphComponents">Online Documentation</a>
 */
 open protected   fun findIsolatedGraphComponents( graph: LayoutGraph ,
 compNumber: INodeMap<Int> ):Int

companion object : ClassMetadata<IsolatedGroupComponentLayout> {
}
}

inline fun IsolatedGroupComponentLayout(
    block: IsolatedGroupComponentLayout.() -> Unit
): IsolatedGroupComponentLayout {
    return IsolatedGroupComponentLayout()
        .apply(block)
}

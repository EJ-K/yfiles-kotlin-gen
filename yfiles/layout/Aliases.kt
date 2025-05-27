// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.layout

import js.promise.Promise

/**
 * Implements the actual work in the context of a [LayoutExecutorAsync].
 * @param [graph] The graph to perform the calculations on. If you need a custom graph implementation, consider overwriting [createLayoutGraph][LayoutExecutorAsyncWorker].
 * @param [descriptor] The descriptor that was set on the [layoutDescriptor][LayoutExecutorAsync] and send to this context.
 * @return An optional `Promise` that will resolve to the data received from the worker context. This allows for asynchronously loading additional code and data that is required to complete the calculation.
 * @see [LayoutExecutorAsyncWorker.process]
 * @see [LayoutExecutorAsyncWorker]
 */
typealias WorkerHandler = (graph: LayoutGraph, descriptor: LayoutDescriptor) -> Any

/**
 * Implements message passing between two contexts.
 * @param [data] The data to send to the [process][LayoutExecutorAsyncWorker] method in the worker context.
 * @return A `Promise` that will resolve to the data received from the worker context.
 * @see [LayoutExecutorAsyncWorker.process]
 */
typealias WorkerMessageHandler = (data: Any) -> Promise<Any>
